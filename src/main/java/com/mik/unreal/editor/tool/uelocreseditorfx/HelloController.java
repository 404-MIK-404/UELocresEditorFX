package com.mik.unreal.editor.tool.uelocreseditorfx;

import com.mik.unreal.editor.tool.uelocreseditorfx.service.ServiceApplication;
import com.mik.unreal.editor.tool.uelocreseditorfx.utils.SwitcherSceneUtil;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Component
@RequiredArgsConstructor
public class HelloController {

    private final ServiceApplication serviceApplication;

    private final ConfigurableApplicationContext applicationContext;

    @FXML
    private Label welcomeText;

    @FXML
    private Button helloWorldBtn;


    @FXML
    protected void onHelloButtonClick() throws IOException {
        Stage stage = (Stage) helloWorldBtn.getScene().getWindow();
        stage.close();

        SwitcherSceneUtil.changeScene(getClass(),stage,"second-view.fxml",applicationContext);
        /*
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("second-view.fxml"));
        fxmlLoader.setControllerFactory(applicationContext::getBean);
        Parent root1 = (Parent) fxmlLoader.load();
        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Другая форма");
        stage.setScene(new Scene(root1));
        stage.show();

         */
        //serviceApplication.sayHello();
        //welcomeText.setText("Welcome to JavaFX Application!");
    }


}