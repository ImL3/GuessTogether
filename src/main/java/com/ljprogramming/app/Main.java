package com.ljprogramming.app;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main extends Application {

    private final String SPRING_PATH = "/spring";
    private final String SPRING_CONFIG_NAME = "spring-config";

    public static void main(String[] args) {

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(SPRING_PATH + "/" + SPRING_PATH + ".xml");

        Navigation navigation = applicationContext.getBean("navigation", Navigation.class);

        navigation.


    }
}
