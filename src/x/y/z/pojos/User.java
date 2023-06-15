package x.y.z.pojos;

public class User implements Cloneable {
    private String name;
    private int id;
    private double money;
    private Car car;
    private int avatarNumber;

    public User(String name, int id, double money, Car car,int avatarNumber) {
        this.name = name;
        this.id = id;
        this.money = money;
        this.car = car;
        this.avatarNumber = avatarNumber;
    }

    public int getAvatarNumber() {
        return avatarNumber;
    }

    public void setAvatarNumber(int avatarNumber) {
        this.avatarNumber = avatarNumber;
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

    @Override
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
