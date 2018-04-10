package pe;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class HelloWorldDev extends HelloWorld{


    public HelloWorldDev(@Value("from dev") String message) {
        super(message);
    }
}