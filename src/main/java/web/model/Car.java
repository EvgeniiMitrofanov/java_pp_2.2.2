package web.model;

public class Car {

    private int id;

    private String model;

    private String series;

    public Car() {}

    public Car(int id, String model, String series) {
        this.model = model;
        this.series = series;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id = " + id +
                ", model = '" + model + '\'' +
                ", series = '" + series + '\'' +
                '}';
    }
}
