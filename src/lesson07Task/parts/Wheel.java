package lesson07Task.parts;

import java.util.Objects;

public class Wheel {
    private int idWheel;
    private int price;
    private String wheelModel;

    public Wheel(){
    }

    public Wheel(int idWheel, int price, String wheelModel) {
        this.idWheel = idWheel;
        this.price = price;
        this.wheelModel = wheelModel;
    }

    public int getIdWheel() {
        return idWheel;
    }

    public void setIdWheel(int idWheel) {
        this.idWheel = idWheel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getWheelModel() {
        return wheelModel;
    }

    public void setWheelModel(String wheelModel) {
        this.wheelModel = wheelModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return idWheel == wheel.idWheel &&
                price == wheel.price &&
                Objects.equals(wheelModel, wheel.wheelModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idWheel, price, wheelModel);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "idWheel=" + idWheel +
                ", price=" + price +
                ", wheelModel='" + wheelModel + '\'' +
                '}';
    }
}
