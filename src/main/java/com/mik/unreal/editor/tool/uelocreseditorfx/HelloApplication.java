package com.mik.unreal.editor.tool.uelocreseditorfx;

import com.mik.unreal.editor.tool.uelocreseditorfx.service.ServiceApplication;
import com.mik.unreal.editor.tool.uelocreseditorfx.utils.SwitcherSceneUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;


public class HelloApplication extends Application {

    private ConfigurableApplicationContext applicationContext;

    @Override
    public void start(Stage stage) throws IOException {
        applicationContext = new SpringApplicationBuilder(SpringHelloApplication.class).run();
        SwitcherSceneUtil.changeScene(HelloApplication.class,stage,"hello-view.fxml",applicationContext);
        /*
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        fxmlLoader.setControllerFactory(applicationContext::getBean);
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

         */
    }

    @Override
    public void stop() {
        applicationContext.close();
    }

    public static void main(String[] args) {
        launch();
    }

}