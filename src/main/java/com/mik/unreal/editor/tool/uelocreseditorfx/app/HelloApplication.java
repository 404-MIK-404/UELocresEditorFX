package com.mik.unreal.editor.tool.uelocreseditorfx.app;

import com.mik.unreal.editor.tool.uelocreseditorfx.utils.SwitcherSceneUtil;
import com.mik.unreal.editor.tool.uelocreseditorfx.view.HelloController;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;


public class HelloApplication extends Application {

    private ConfigurableApplicationContext applicationContext;

    private SpringFxmlLoader springFxmlLoader;

    @Override
    public void start(Stage stage) throws IOException {
        applicationContext = new SpringApplicationBuilder(SpringHelloApplication.class).run();
        springFxmlLoader = applicationContext.getBean(SpringFxmlLoader.class);
        springFxmlLoader.changeScene(HelloController.class,stage,"/view/hello-view.fxml");
    }

    @Override
    public void stop() {
        applicationContext.close();
    }

    public static void main(String[] args) {
        launch();
    }

}