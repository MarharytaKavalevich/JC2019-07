package lesson11;

public class RunnableCallCenter implements Runnable {

    @Override
    public void run() {
        System.out.println("All operators are currently busy. Please expect.");
    }
}
