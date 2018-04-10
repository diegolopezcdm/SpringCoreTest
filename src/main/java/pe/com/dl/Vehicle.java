package pe.com.dl;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singleton")
public abstract class Vehicle {

    private String name;

    public Vehicle(){}

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
