package lesson07Task.parts;

import java.util.Objects;

public class Chassis {

    private int idChassis;
    private int price;
    private String chassisModel;

    public Chassis() {
    }

    public Chassis(int idChassis, int price, String chassisModel) {
        this.idChassis = idChassis;
        this.price = price;
        this.chassisModel = chassisModel;
    }

    public int getIdChassis() {
        return idChassis;
    }

    public void setIdChassis(int idChassis) {
        this.idChassis = idChassis;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getChassisModel() {
        return chassisModel;
    }

    public void setChassisModel(String chassisModel) {
        this.chassisModel = chassisModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chassis chassis = (Chassis) o;
        return idChassis == chassis.idChassis &&
                price == chassis.price &&
                Objects.equals(chassisModel, chassis.chassisModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idChassis, price, chassisModel);
    }

    @Override
    public String toString() {
        return "Chassis{" +
                "idChassis=" + idChassis +
                ", price=" + price +
                ", chassisModel='" + chassisModel + '\'' +
                '}';
    }
}
