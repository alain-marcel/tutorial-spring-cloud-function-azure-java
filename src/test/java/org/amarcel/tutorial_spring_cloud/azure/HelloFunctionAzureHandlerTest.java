package org.amarcel.tutorial_spring_cloud.azure;

import org.amarcel.tutorial_spring_cloud.SpringBootApp;
import org.amarcel.tutorial_spring_cloud.hello.Person;
import org.amarcel.tutorial_spring_cloud.hello.WelcomeMessage;
import org.assertj.core.api.Assertions;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.cloud.function.adapter.azure.AzureSpringBootRequestHandler;

public class HelloFunctionAzureHandlerTest {

  @Test
  @Ignore
  public void helloAzureFunctionShouldReturnWelcomeMessage() {
//    final WelcomeMessage result = new SpringBootApp().uppercase().apply(new Foo("foo"));
//    
//    Assertions
//      .assertThat(result.getValue())
//      .isEqualTo("FOO");
  }

  @Test
  public void start() {

    AzureSpringBootRequestHandler<Person, WelcomeMessage> handler =
      new AzureSpringBootRequestHandler<>(SpringBootApp.class);

    Person p = new Person();
    p.setName("foo");
    WelcomeMessage result = handler.handleRequest(p, null);
    handler.close();

    Assertions
      .assertThat(result.getWelcomeMessage())
      .isEqualTo("Welcome foo !");

  }

}