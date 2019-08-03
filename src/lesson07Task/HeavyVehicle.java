package lesson07Task.vehicle;

import lesson07Task.interfaces.Transportable;
import lesson07Task.parts.*;
import lesson07Task.util.Firm;

import java.util.Objects;

public abstract class HeavyVehicle  extends Car implements Transportable {

    private int loadCapacity;

    public HeavyVehicle() {
    }

    public HeavyVehicle(Firm carFirm, String carModel, Door door, Engine engine, Wheel wheel, Body body, Chassis chassis, int loadCapacity) {
        super(carFirm, carModel, door, engine, wheel, body, chassis);
        this.loadCapacity = loadCapacity;
    }

    abstract void loadHeavyVehicle(int weight);

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void executeTransportation () {
        System.out.println("Transportation is executed by heavy vehicle with load capacity " + loadCapacity + " kg.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HeavyVehicle that = (HeavyVehicle) o;
        return loadCapacity == that.loadCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }

    @Override
    public String toString() {
        return "HeavyVehicle{" +
                "loadCapacity=" + loadCapacity +
                '}';
    }
}
