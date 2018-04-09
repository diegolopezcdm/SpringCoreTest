

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.com.dl.Bike;
import pe.com.dl.Car;
import pe.com.dl.Person;

import java.util.Date;

public class MainApp {
    public static void main(String[] args) {

        System.setProperty("spring.profiles.active", "prod");

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        System.out.println("reading enviroment: "+context.getEnvironment().getProperty("spring.profiles.active"));

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();

        System.out.println("=========== PERSONS ======");

        Person person2 = (Person) context.getBean(Person.class);
        System.out.println(person2);

        Person juan = (Person) context.getBean("person2");
        System.out.println(juan);

        Person diego = (Person) context.getBean("personDiego");
        System.out.println(diego);

        System.out.println("");
        System.out.println("=========== CAR ======");
        Car car1 = (Car) context.getBean("car1");
        System.out.println(car1);
        Car car2 = (Car) context.getBean("car2");
        System.out.println(car2);

        System.out.println("");
        System.out.println("=========== BIKE ======");
        Bike bike = (Bike) context.getBean("bike");
        System.out.println(bike);
    }
}