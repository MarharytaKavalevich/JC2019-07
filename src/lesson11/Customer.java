package lesson11;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Customer extends Thread {

    private CyclicBarrier barrier;
    private Semaphore operators;
    String customerName;

    public Customer(CyclicBarrier barrier, Semaphore operators, String customerName) {
        this.barrier = barrier;
        this.operators = operators;
        this.setName(customerName);
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println("Customer " + getName() + " awaiting operator response.");

            barrier.await();

            operators.acquire();

            System.out.println("Customer " + getName() + " connects to the operator.");

            Thread.sleep(3000);

            System.out.println("Customer " + getName() + " finished the conversation with the operator.");

            operators.release();

            System.out.println("Available operators = " + operators.availablePermits());

        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
