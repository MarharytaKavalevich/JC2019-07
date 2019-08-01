package lesson04Task;

public class Util {
    public static double carPrice (Car car){
        return car.getDoor().getPrice() + car.getEngine().getPrice() + car.getWheel().getPrice() + car.getBody().getPrice() + car.getChassis().getPrice();
    }
} 
