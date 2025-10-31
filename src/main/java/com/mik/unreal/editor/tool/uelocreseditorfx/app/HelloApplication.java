package com.mik.unreal.editor.tool.uelocreseditorfx.app;

import com.mik.unreal.editor.tool.uelocreseditorfx.view.HelloController;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@SpringBootApplication(scanBasePackages = {"com.mik.unreal.editor.tool.uelocreseditorfx.*"})
public class HelloApplication extends Application {

    private ConfigurableApplicationContext applicationContext;

    private SpringFxmlLoader springFxmlLoader;


    @Override
    public void start(Stage stage) throws IOException {
        applicationContext = SpringApplication.run(HelloApplication.class);
        springFxmlLoader = applicationContext.getBean(SpringFxmlLoader.class);
        springFxmlLoader.changeScene(HelloController.class,stage,"/view/hello-view.fxml");
    }

    @Override
    public void stop() {
        applicationContext.close();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}