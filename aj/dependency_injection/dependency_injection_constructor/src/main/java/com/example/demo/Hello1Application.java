package com.example.demo;
import   org.springframework.boot.CommandLineRunner;
import   org.springframework.boot.SpringApplication;
import    org.springframework.boot.autoconfigure.SpringBootApplication;
import   org.springframework.context.annotation.Bean;
import   org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import   org.springframework.web.bind.annotation.GetMapping;
import   org.springframework.web.bind.annotation.RestController;

@SpringBootApplication @ComponentScan(basePackages = "com.example.demo") public class Hello1Application {

public static void main(String[] args) { SpringApplication.run(Hello1Application.class, args);
}
@Bean
public CommandLineRunner demo(Car car) {
return args -> {
// Start the Car
 


car.setModel("Honda"); Driver dr=new Driver(); dr.setName("chirag");

car.setDriver(dr); car.start();
};
}

}
@RestController
class HelloController {

private final Car car;

public HelloController(Car car) {
this.car = car;
}

@GetMapping("/hello")
public String hello() { car.start();
return car.getModel();
}
}

