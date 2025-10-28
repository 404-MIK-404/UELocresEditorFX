module com.mik.unreal.editor.tool.uelocreseditorfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.mik.unreal.editor.tool.uelocreseditorfx to javafx.fxml;
    exports com.mik.unreal.editor.tool.uelocreseditorfx;
}