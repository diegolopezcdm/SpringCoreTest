package pe.com.dl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike extends Vehicle {

    @Autowired
    public Bike(@Value("First Bike") String name) {
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
