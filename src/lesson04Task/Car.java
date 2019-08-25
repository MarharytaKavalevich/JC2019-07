package lesson04Task;

import java.util.Objects;

public class Car {
    private static String CAR_FIRM = "Mercedes";
    private static String CAR_MODEL = "CLS";

    private Door door;
    private Engine engine;
    private Wheel wheel;
    private Body body;
    private Chassis chassis;
    
    public Car() {
    }

    public Car(Door door, Engine engine, Wheel wheel, Body body, Chassis chassis) {
        this.door = door;
        this.engine = engine;
        this.wheel = wheel;
        this.body = body;
        this.chassis = chassis;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }   

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public static String getCarFirm() {
        return CAR_FIRM;
    }

    public static void setCarFirm(String carFirm) {
        CAR_FIRM = carFirm;
    }

    public static String getCarModel() {
        return CAR_MODEL;
    }

    public static void setCarModel(String carModel) {
        CAR_MODEL = carModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(door, car.door) &&
                Objects.equals(engine, car.engine) &&
                Objects.equals(wheel, car.wheel) &&
                Objects.equals(body, car.body) &&
                Objects.equals(chassis, car.chassis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(door, engine, wheel, body, chassis);
    }

    @Override
    public String toString() {
        return "Car{" +
                "door=" + door +
                ", engine=" + engine +
                ", wheel=" + wheel +
                ", body=" + body +
                ", chassis=" + chassis +
                '}';
    }
}
