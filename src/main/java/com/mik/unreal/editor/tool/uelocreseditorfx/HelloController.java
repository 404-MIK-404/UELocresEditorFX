package com.mik.unreal.editor.tool.uelocreseditorfx;

import com.mik.unreal.editor.tool.uelocreseditorfx.service.ServiceApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class HelloController {

    private final ServiceApplication serviceApplication;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        serviceApplication.sayHello();
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}