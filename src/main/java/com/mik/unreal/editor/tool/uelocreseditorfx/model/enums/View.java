package com.mik.unreal.editor.tool.uelocreseditorfx.model.enums;

import com.mik.unreal.editor.tool.uelocreseditorfx.app.FxmlConfigView;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum View {

    HOME(FxmlConfigView.URL_VIEW + "/home.fxml","Home"),
    SETTINGS(FxmlConfigView.URL_VIEW + "/settings.fxml","Settings"),
    ABOUT(FxmlConfigView.URL_VIEW + "/about.fxml","About"),;

    private String fxmlView;

    private String title;

}
