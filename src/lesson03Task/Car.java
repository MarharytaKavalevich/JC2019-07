package lesson03Task;

import java.io.Serializable;

public class Car extends B implements Serializable, Cloneable {
    public int weight;
    public long year;
    public double price;

    public int someInt;

    public Car() {
        System.out.println("Inside default constructor");
    }

    public Car(String someString) {
        weight = 3000;
        year = 2019;
        price = 70000;
        System.out.println("Inside constr with params");
    }

    public int dif(int i, int j) {
        return i - j;
    }

    public void someLogic(int x) {
        System.out.println("Inside method someLogic");

        switch (x) {
            case 3500:
                System.out.println("Легковая");
            case 4000:
                System.out.println("Джип");
            case 4500:
                System.out.println("Грузовая");
        }
    }

    public static void someStaticMethod() {
        System.out.println("Inside Static Method");
    }
}
