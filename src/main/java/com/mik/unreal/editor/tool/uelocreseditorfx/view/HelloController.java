package com.mik.unreal.editor.tool.uelocreseditorfx.view;

import com.mik.unreal.editor.tool.uelocreseditorfx.app.SpringFxmlLoader;
import com.mik.unreal.editor.tool.uelocreseditorfx.service.ServiceApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Component
@RequiredArgsConstructor
public class HelloController {

    private final ServiceApplication serviceApplication;

    private final SpringFxmlLoader springFxmlLoader;

    @FXML
    private Label welcomeText;

    @FXML
    private Button helloWorldBtn;


    @FXML
    protected void onHelloButtonClick() throws IOException {
        Stage stage = (Stage) helloWorldBtn.getScene().getWindow();
        stage.close();
        springFxmlLoader.changeScene(getClass(),stage,"/view/second-view.fxml");
        //serviceApplication.sayHello();
        //welcomeText.setText("Welcome to JavaFX Application!");
    }


}