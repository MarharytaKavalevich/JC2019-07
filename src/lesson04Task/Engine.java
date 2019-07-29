package lesson04Task;

import java.util.Objects;

public class Engine {
    private int idEngine;
    private int price;
    private String engineModel;

    public Engine(){
    }

    public Engine(int idEngine, int price, String engineModel) {
        this.idEngine = idEngine;
        this.price = price;
        this.engineModel = engineModel;
    }

    public int getIdEngine() {
        return idEngine;
    }

    public void setIdEngine(int idEngine) {
        this.idEngine = idEngine;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return idEngine == engine.idEngine &&
                price == engine.price &&
                Objects.equals(engineModel, engine.engineModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEngine, price, engineModel);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "idEngine=" + idEngine +
                ", price=" + price +
                ", engineModel='" + engineModel + '\'' +
                '}';
    }
}


