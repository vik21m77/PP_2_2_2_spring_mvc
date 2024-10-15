package web.Model;

public class Car {
    private int id;
    private String model;
    private int year;

    public Car(){

    }

    public Car(int id, String model, int year) {
        this.id = id;
        this.model = model;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
