package pe.com.dl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car extends Vehicle {

    @Value("${numberOfTires}")
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
