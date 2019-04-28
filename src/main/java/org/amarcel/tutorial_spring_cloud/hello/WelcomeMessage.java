package org.amarcel.tutorial_spring_cloud.hello;

public class WelcomeMessage {

    private String welcomeMessage;

    public WelcomeMessage() {
    }

    public WelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    @Override
    public String toString() {
        return String.format("WelcomeMessage{welcomeMessage='%s'}", welcomeMessage);
    }
}
