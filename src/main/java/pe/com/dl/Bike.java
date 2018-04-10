package pe.com.dl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Bike extends Vehicle {

    public Bike(@Value("default first name") String name) {
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
