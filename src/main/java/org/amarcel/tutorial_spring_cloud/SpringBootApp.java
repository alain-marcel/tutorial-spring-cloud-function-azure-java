package org.amarcel.tutorial_spring_cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @see <a href="https://cloud.spring.io/spring-cloud-static/spring-cloud-function/2.1.0.RC1/index.html#_functional_bean_definitions">How to define beans?</a>
 */
@SpringBootApplication
@ComponentScan(lazyInit = true)
public class SpringBootApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class, args);
    }
}
