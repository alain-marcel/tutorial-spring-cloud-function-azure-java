package org.amarcel.tutorial_spring_cloud.hello;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component(HelloFunction.FUNCTION_NAME)
public class HelloFunction implements Function<Person, WelcomeMessage> {

  public static final String FUNCTION_NAME = "hello";

  public HelloFunction() {
  }

  @Override
  public WelcomeMessage apply(Person person) {
    String message = String.format("Welcome %s !", person.getName());
    return new WelcomeMessage(message);
  }
}
