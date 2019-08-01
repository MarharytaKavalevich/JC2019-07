package lesson04Task;

public class Demo {
    public static void main(String[] args) {
        Door door1 = new Door(1, 100, "Door1");
        Door door2 = new Door(2, 200, "Door2");

        Engine engine1 = new Engine(1, 1000, "Engine1");
        Engine engine2 = new Engine(2, 2000, "Engine2");

        Wheel wheel1 = new Wheel(1, 100, "Wheel1");
        Wheel wheel2 = new Wheel(2, 200, "Wheel2");

        Body body1 = new Body(1, 100, "Body1");
        Body body2 = new Body(2, 200, "Body2");

        Chassis chassis1 = new Chassis(1, 100, "Chassis1");
        Chassis chassis2 = new Chassis(2, 200, "Chassis2");

        Car car1 = new Car(door1, engine1, wheel1, body1, chassis1);
        Car car2 = new Car(door2, engine2, wheel2, body2, chassis2);

        System.out.println("Стоимость автомобиля " + Util.carPrice(car1));
        System.out.println("Название фирмы производителя " + Car.getCarFirm());
        System.out.println("Название модели " + Car.getCarModel());
        System.out.println("Стоимость автомобиля с заменёнными деталями " + Util.carPrice(car2));
    }
}



