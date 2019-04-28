package org.amarcel.tutorial_spring_cloud.hello;

public class Person {

  private String name;

  public Person() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("Person{name='%s'}", name);
  }
}
