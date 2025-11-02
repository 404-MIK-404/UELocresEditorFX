package com.mik.unreal.editor.tool.uelocreseditorfx.model.enums;

import com.mik.unreal.editor.tool.uelocreseditorfx.app.FxmlConfigView;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum View {

    HOME(FxmlConfigView.URL_VIEW + "/home.fxml"),
    SETTINGS(FxmlConfigView.URL_VIEW + "/settings.fxml");

    private String fxmlView;

}
