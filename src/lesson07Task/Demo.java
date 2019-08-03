package lesson07Task;

import lesson07Task.parts.*;
import lesson07Task.util.CarUtil;
import lesson07Task.util.Firm;
import lesson07Task.vehicle.Car;
import lesson07Task.vehicle.Limousine;
import lesson07Task.vehicle.Truck;

public class Demo {
    public static void main(String[] args) {
        Door door1 = new Door(1, 1000, "Door1");
        Door door2 = new Door(2, 2000, "Door2");

        Engine engine1 = new Engine(1, 10000, "Engine1");
        Engine engine2 = new Engine(2, 20000, "Engine2");

        Wheel wheel1 = new Wheel(1, 1000, "Wheel1");
        Wheel wheel2 = new Wheel(2, 2000, "Wheel2");

        Body body1 = new Body(1, 10000, "Body1");
        Body body2 = new Body(2, 20000, "Body2");

        Chassis chassis1 = new Chassis(1, 1000, "Chassis1");
        Chassis chassis2 = new Chassis(2, 2000, "Chassis2");

        Truck truck = new Truck(Firm.Mercedes,"Actros",door1, engine1, wheel1, body1, chassis1, 100);
        Limousine limousine = new Limousine(Firm.Mercedes, "Pullman", door2, engine2, wheel2, body2, chassis2, 12);
        System.out.println("Car price " + CarUtil.calculateCarPrice(truck));
        truck.getDoor().fix("window");
        System.out.println("Car price!! " + CarUtil.calculateCarPrice(truck));
        truck.loadHeavyVehicle(80);
        Truck truck3 = new Truck(Firm.Volvo, "FH", door1, engine1, wheel1, body2, chassis1, 90){
            @Override
            public void executeTransportation(){
                System.out.println("!!!!!Transportation is executed by truck with current weight");
            }
        };
        System.out.println(truck.toString());
        truck.executeTransportation();
        limousine.executeTransportation();

        Car[] array = {truck, limousine, truck3};
        for (int i = 0; i < array.length; i++) {
            Car car = array[i];
            System.out.println(car.getCarModel() + " price " + car.getPrice());
        }
        for (int i = 0; i < array.length; i++) {
            Car car = array[i];
            car.getDoor().fix("window");
        }
        for (int i = 0; i < array.length; i++) {
            Car car = array[i];
            car.executeTransportation();
        }
            truck.loadHeavyVehicle(45);
            truck.executeTransportation();
        }
}



