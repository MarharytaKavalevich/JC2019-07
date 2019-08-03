package lesson07Task.vehicle;

import lesson07Task.parts.*;
import lesson07Task.util.Firm;

public class Limousine extends LightVehicle {
    public Limousine() {
    }

    public Limousine(Firm carFirm, String carModel, Door door, Engine engine, Wheel wheel, Body body, Chassis chassis, int numberOfPassengers) {
        super(carFirm, carModel, door, engine, wheel, body, chassis, numberOfPassengers);
    }

    @Override
    public String toString() {
        return "Limousine{"
                 +" numberOfPassengers=" + getNumberOfPassengers() +
                "}";
    }
}
