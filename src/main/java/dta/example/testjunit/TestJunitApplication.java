package dta.example.testjunit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.String.format;

@SpringBootApplication
@RestController
public class TestJunitApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestJunitApplication.class, args);
    }

    @RequestMapping(value = "", produces = "application/json")
    public String get() {
        return "Hi";
    }

}
