package com.mik.unreal.editor.tool.uelocreseditorfx.app;

import com.mik.unreal.editor.tool.uelocreseditorfx.model.enums.View;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@SpringBootApplication(scanBasePackages = {"com.mik.unreal.editor.tool.uelocreseditorfx.*"})
public class UELocresEditorApplication extends Application {

    private ConfigurableApplicationContext applicationContext;

    private SpringFxmlLoader springFxmlLoader;

    @Override
    public void start(Stage stage) throws IOException {
        applicationContext = SpringApplication.run(UELocresEditorApplication.class);
        springFxmlLoader = applicationContext.getBean(SpringFxmlLoader.class);
        springFxmlLoader.loadScene(stage, View.HOME);
    }

    @Override
    public void stop() {
        applicationContext.close();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}