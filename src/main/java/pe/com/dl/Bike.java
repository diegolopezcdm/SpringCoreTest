package pe.com.dl;

public class Bike extends Vehicle {

    public Bike(String name) {
        super(name);
    }

    public void go() {

    }

    public void stop() {

    }

    @Override
    public String toString() {
        return "Bike{name : "+getName()+"}";
    }
}
