package lesson07Task.vehicle;

import lesson07Task.interfaces.Transportable;
import lesson07Task.parts.*;
import lesson07Task.util.Firm;

import java.util.Objects;

public abstract class LightVehicle extends Car {

    private int numberOfPassengers;

    public LightVehicle() {
    }

    public LightVehicle(Firm carFirm, String carModel, Door door, Engine engine, Wheel wheel, Body body, Chassis chassis, int numberOfPassengers) {
        super(carFirm, carModel, door, engine, wheel, body, chassis);
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LightVehicle that = (LightVehicle) o;
        return numberOfPassengers == that.numberOfPassengers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfPassengers);
    }

    @Override
    public String toString() {
        return "LightVehicle{" +
                "numberOfPassengers=" + numberOfPassengers +
                '}';
    }

    @Override
    public void executeTransportation () {
        System.out.println("Transportation is executed by light vehicle with " + numberOfPassengers + " passengers.");
    }

    public void executeTransportation (int numberOfLuggage) {
        System.out.println("Transportation is executed by light vehicle with " + numberOfPassengers + " passengers and "  + numberOfLuggage + " luggage");
    }
}
