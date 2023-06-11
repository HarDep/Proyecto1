package x.y.z.pojos;

public class User {
    private String name;
    private int id;
    private double money;
    private Car car;

    public User(String name, int id, double money, Car car) {
        this.name = name;
        this.id = id;
        this.money = money;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
