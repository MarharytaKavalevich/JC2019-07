package lesson07Task.vehicle;

import lesson07Task.interfaces.Transportable;
import lesson07Task.parts.*;
import lesson07Task.util.Firm;

import java.util.Objects;

public class Truck extends HeavyVehicle {
    private int currentWeight;

    public Truck() {
    }

    public Truck(Firm carFirm, String carModel, Door door, Engine engine, Wheel wheel, Body body, Chassis chassis, int loadCapacity) {
        super(carFirm, carModel, door, engine, wheel, body, chassis, loadCapacity);
        this.currentWeight = 0;
    }

    @Override
    public  void loadHeavyVehicle(int weight){
        if (weight <= getLoadCapacity()){
            this.currentWeight = weight;
            System.out.println("Cargo ( " + currentWeight + " tonnes) was loaded.");
        } else {
            System.out.println("Loading isn't executed by this truck. Please, find another truck.");
        }
    }

    @Override
    public void executeTransportation () {
         System.out.println("Transportation is executed by truck with current weight " + currentWeight + " tonnes.");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return currentWeight == truck.currentWeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), currentWeight);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "currentWeight=" + currentWeight +
                '}';
    }
}
