package pe.com.dl;

public class Car extends Vehicle {

    private Integer numberOfTires;

    public Car() {
        super(null);
    }


    public Car(String name) {
        super(name);
    }

    public void go() {

    }

    public void stop() {

    }

    public Integer getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(Integer numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    @Override
    public String toString() {
        return "Car{name : "+getName()+
                "numberOfTires=" + numberOfTires +"}";
    }
}
