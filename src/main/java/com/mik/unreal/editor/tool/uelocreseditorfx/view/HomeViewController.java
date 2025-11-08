package com.mik.unreal.editor.tool.uelocreseditorfx.view;

import com.mik.unreal.editor.tool.uelocreseditorfx.app.SpringFxmlLoader;
import com.mik.unreal.editor.tool.uelocreseditorfx.model.enums.View;
import com.mik.unreal.editor.tool.uelocreseditorfx.service.ServiceApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;


@Component
@RequiredArgsConstructor
public class HomeViewController {

    private final SpringFxmlLoader springFxmlLoader;

    @FXML
    private MenuBar homeMenuBar;

    @FXML
    protected void onClickMenuItemImportFile() {
        Stage stage = (Stage) homeMenuBar.getScene().getWindow();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Выберите файл");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Поддерживаемые файлы (*.json, *.csv, *.locres)", "*.json", "*.csv", "*.locres"),
                new FileChooser.ExtensionFilter("JSON файл", "*.json"),
                new FileChooser.ExtensionFilter("CSV файл", "*.csv"),
                new FileChooser.ExtensionFilter("Locres файл", "*.locres")
        );
        File selectedFile = fileChooser.showOpenDialog(stage);
        if (selectedFile != null) {
            System.out.println("Выбран файл: " + selectedFile.getAbsolutePath());
        } else {
            System.out.println("Файл не выбран.");
        }
    }

    @FXML
    protected void onClickMenuItemExportFile() {
        Stage stage = (Stage) homeMenuBar.getScene().getWindow();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Сохранить как...");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("JSON файл", "*.json"),
                new FileChooser.ExtensionFilter("CSV файл", "*.csv"),
                new FileChooser.ExtensionFilter("Locres файл", "*.locres")
        );
        File file = fileChooser.showSaveDialog(stage);
        if (file != null) {
            System.out.println("Сохранить файл в : " + file.getAbsolutePath());
        }
    }

    @FXML
    protected void onClickMenuItemPreference() throws IOException {
        springFxmlLoader.loadScene(View.SETTINGS);
    }

    @FXML
    protected void onClickMenuItemAbout() throws IOException {
        springFxmlLoader.loadScene(View.ABOUT);
    }

    @FXML
    protected void onClickMenuItemCloseApplication() {
        Stage stage = (Stage) homeMenuBar.getScene().getWindow();
        stage.fireEvent(new WindowEvent(stage, WindowEvent.WINDOW_CLOSE_REQUEST));
    }


}