package lesson07Task.vehicle;

import lesson07Task.interfaces.Transportable;
import lesson07Task.parts.*;
import lesson07Task.util.Firm;

import java.util.Locale;
import java.util.Objects;

public abstract class Car implements Transportable {

    private Firm carFirm;
    private String carModel;
    private Door door;
    private Engine engine;
    private Wheel wheel;
    private Body body;
    private Chassis chassis;

    public Car() {
    }

    public Car(Firm carFirm, String carModel, Door door, Engine engine, Wheel wheel, Body body, Chassis chassis) {
        this.carFirm = carFirm;
        this.carModel = carModel;
        this.door = door;
        this.engine = engine;
        this.wheel = wheel;
        this.body = body;
        this.chassis = chassis;
    }

    public Firm getCarFirm() {
        return carFirm;
    }

    public void setCarFirm(Firm carFirm) {
        this.carFirm = carFirm;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carFirm, car.carFirm) &&
                Objects.equals(carModel, car.carModel) &&
                Objects.equals(door, car.door) &&
                Objects.equals(engine, car.engine) &&
                Objects.equals(wheel, car.wheel) &&
                Objects.equals(body, car.body) &&
                Objects.equals(chassis, car.chassis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carFirm, carModel, door, engine, wheel, body, chassis);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carFirm='" + carFirm + '\'' +
                ", carModel='" + carModel + '\'' +
                ", door=" + door +
                ", engine=" + engine +
                ", wheel=" + wheel +
                ", body=" + body +
                ", chassis=" + chassis +
                '}';
    }

    public int getPrice(){
        return getDoor().getPrice() + getEngine().getPrice() + getWheel().getPrice() + getBody().getPrice() + getChassis().getPrice();
    }

    public int getPrice(int discount){
        return discount * (getDoor().getPrice() + getEngine().getPrice() + getWheel().getPrice() + getBody().getPrice() + getChassis().getPrice()) / 100;
    }
}
