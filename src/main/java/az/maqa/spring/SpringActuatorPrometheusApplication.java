package az.maqa.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringActuatorPrometheusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringActuatorPrometheusApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

}
