package lesson11;

import java.util.concurrent.Semaphore;

public class CallCenterDemo {

    private static final boolean[] operator = new boolean[5];

    private static final Semaphore semaphore = new Semaphore(5, true);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            new Thread(new Customer(i)).start();
            Thread.sleep(400);
        }
    }

    public static class Customer implements Runnable {

        private int customerNumber;

        public Customer(int customerNumber) {
            this.customerNumber = customerNumber;
        }

        @Override
        public void run() {
            System.out.printf("Customer №%d awaiting operator response.\n", customerNumber);
            try {
                semaphore.acquire();
                int operatorNumber = -1;
                synchronized (operator) {
                    for (int i = 0; i < 10; i++)
                        if (!operator[i]) {
                            operator[i] = true;
                            operatorNumber = i;
                            System.out.printf("Customer №%d is connected to the operator %d.\n", customerNumber, i);
                            break;
                        }
                }
                Thread.sleep(3000);
                synchronized (operator) {
                    operator[operatorNumber] = false;
                }
                semaphore.release();
                System.out.printf("Customer №%d finished the conversation with the operator.\n", customerNumber);
            } catch (InterruptedException e) {
            }
        }
    }
}
