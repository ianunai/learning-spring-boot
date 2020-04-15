package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

    public static void main(String[] args) {
        /** Takes in two arguments:
         * 1. Class where the Spring Boot app is defined to run, i.e., CourseApiApp class
         * 2. Arguments that are passed on to the main method of the aforementioned class, i.e., String[] args
         */
        SpringApplication.run(CourseApiApp.class, args);
    }

}
