package lesson04Task;

public class CarUtil {
    public static double calculateCarPrice (Car car){
        return car.getDoor().getPrice() + car.getEngine().getPrice() + car.getWheel().getPrice() + car.getBody().getPrice() + car.getChassis().getPrice();
    }
} 
