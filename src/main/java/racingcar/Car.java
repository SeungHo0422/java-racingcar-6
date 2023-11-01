package racingcar;

public class Car {

    private String name;
    private int distance;

    public Car(String name) {
        this.name = name;
        this.distance = 0;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
    public void addDistance(int distance) {
        this.distance += distance;
    }
    public String getName() {
        return name;
    }
}
