package lesson11;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class CallCenter {

    //тема колл центр.
    // В колл центре имеется заданное число операторов и определенная вместимость по клиентам,
    // необходимо организовать эмуляцию работы колцентра, т.е. разговор оператора с клиентом.
    // Те клиенты, для которых оператора не нашлось должны быть помещены в очередь для ожидания.
    // А для кого нашлась должны провести разговор с оператором.
    // Каждое действие должно быть записано и выведено на консоль.
    // Колл центр должен обслужить всех клиентов и завершить свою работу.

    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {

        Semaphore operators = new Semaphore(3, true);

        CyclicBarrier barrier = new CyclicBarrier(3, new RunnableCallCenter());

        Customer customer1 = new Customer(barrier, operators, "1");
        Customer customer2 = new Customer(barrier, operators, "2");
        Customer customer3 = new Customer(barrier, operators, "3");
        Customer customer4 = new Customer(barrier, operators, "4");
        Customer customer5 = new Customer(barrier, operators, "5");
        Customer customer6 = new Customer(barrier, operators, "6");
        Customer customer7 = new Customer(barrier, operators, "7");
        Customer customer8 = new Customer(barrier, operators, "8");
        Customer customer9 = new Customer(barrier, operators, "9");
        Customer customer10 = new Customer(barrier, operators, "10");

        System.out.println("Сall center operators is ready to answer the calls");

        System.out.println("Available operator number " + operators.availablePermits());

    }
}
