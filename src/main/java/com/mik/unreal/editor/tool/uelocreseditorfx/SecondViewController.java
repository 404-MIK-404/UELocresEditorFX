package com.mik.unreal.editor.tool.uelocreseditorfx;


import com.mik.unreal.editor.tool.uelocreseditorfx.service.ServiceApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SecondViewController {

    private final ServiceApplication serviceApplication;

    @FXML
    private Label secondTextLabel;





}
