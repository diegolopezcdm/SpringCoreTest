package pe.com.dl;

public abstract class Vehicle {

    private String name;

    public Vehicle(String name){
        this.name = name;
    }

    public abstract void go();
    public abstract void stop();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
