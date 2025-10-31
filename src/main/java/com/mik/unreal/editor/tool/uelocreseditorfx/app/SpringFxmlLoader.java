package com.mik.unreal.editor.tool.uelocreseditorfx.app;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class SpringFxmlLoader {

    private final ConfigurableApplicationContext context;

    public void changeScene(Class clazz, Stage stage, String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(clazz.getResource(fxml));
        fxmlLoader.setControllerFactory(context::getBean);
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setScene(scene);
        stage.show();
    }


}
