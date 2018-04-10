package pe;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class HelloWorldProd extends HelloWorld{


    public HelloWorldProd(@Value("from prod") String message) {
        super(message);
    }
}