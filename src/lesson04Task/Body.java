package lesson04Task;

import java.util.Objects;

public class Body {
    private int idWBody;
    private int price;
    private String bodyModel;

    public Body(){
    }

    public Body(int idWBody, int price, String bodyModel) {
        this.idWBody = idWBody;
        this.price = price;
        this.bodyModel = bodyModel;
    }

    public int getIdWBody() {
        return idWBody;
    }

    public void setIdWBody(int idWBody) {
        this.idWBody = idWBody;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBodyModel() {
        return bodyModel;
    }

    public void setBodyModel(String bodyModel) {
        this.bodyModel = bodyModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Body body = (Body) o;
        return idWBody == body.idWBody &&
                price == body.price &&
                Objects.equals(bodyModel, body.bodyModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idWBody, price, bodyModel);
    }

    @Override
    public String toString() {
        return "Body{" +
                "idWBody=" + idWBody +
                ", price=" + price +
                ", bodyModel='" + bodyModel + '\'' +
                '}';
    }
}
