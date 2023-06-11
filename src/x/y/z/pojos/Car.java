package x.y.z.pojos;

public class Car {
    private double speed;
    private int carType;

    public Car(double speed, int carType) {
        this.speed = speed;
        this.carType = carType;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getCarType() {
        return carType;
    }

    public void setCarType(int carType) {
        this.carType = carType;
    }
}
