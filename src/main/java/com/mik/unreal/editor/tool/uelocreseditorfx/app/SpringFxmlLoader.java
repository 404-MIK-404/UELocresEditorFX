package com.mik.unreal.editor.tool.uelocreseditorfx.app;

import com.mik.unreal.editor.tool.uelocreseditorfx.model.enums.View;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class SpringFxmlLoader {

    private final ApplicationContext applicationContext;

    public void loadScene(Stage stage, View view) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(view.getFxmlView()));
        fxmlLoader.setControllerFactory(applicationContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }


}
