package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired; import org.springframework.stereotype.Component; @Component
public class Car { private String model; private Driver driver;
public String getModel() {
return model;
}
public void setModel(String model) {
this.model = model;
 


}
public Driver getDriver() {
return driver;
}
@Autowired
public void setDriver(Driver driver) {
this.driver = driver;
}
public void start() {
System.out.println("Car model: " + model); System.out.println("Driver: " + driver.getName()); System.out.println("Car is starting...");
}
}


