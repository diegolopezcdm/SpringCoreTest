package pe.com.dl.configuration;

import org.springframework.context.annotation.*;
import pe.com.dl.Car;
import pe.com.dl.Person;

@Configuration
@ComponentScan("pe")
@PropertySource(value = "system.properties")
public class AppConfig {

    @Bean(value = "person1")
    public Person createPerson1(){
        return new Person("juan","lopez", createCar1());
    }

    @Bean(value = "person2")
    public Person createPerson2(){
        return new Person("diego","maradona", createCar2());
    }

    @Bean(value = "car1")
    @Primary
    public Car createCar1(){
        return new Car("First Car");
    }

    @Bean(value = "car2")
    public Car createCar2(){
        return new Car("Second Car");
    }
}
