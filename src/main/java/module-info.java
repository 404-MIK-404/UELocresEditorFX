module com.mik.unreal.editor.tool.uelocreseditorfx {

    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    requires java.sql;
    requires lombok;

    /**
     * Spring Boot
     **/
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.beans;
    requires spring.core;
    requires spring.aop;
    requires spring.boot.starter.web;
    requires spring.web;
    requires org.apache.tomcat.embed.websocket;
    requires com.fasterxml.jackson.annotation;


    opens com.mik.unreal.editor.tool.uelocreseditorfx.service to spring.core, spring.beans, spring.aop;
    opens com.mik.unreal.editor.tool.uelocreseditorfx.model to spring.core, spring.beans, spring.aop;

    exports com.mik.unreal.editor.tool.uelocreseditorfx.view;
    opens com.mik.unreal.editor.tool.uelocreseditorfx.view to javafx.fxml, spring.aop, spring.beans, spring.core;
    exports com.mik.unreal.editor.tool.uelocreseditorfx.app;
    opens com.mik.unreal.editor.tool.uelocreseditorfx.app to javafx.fxml, spring.aop, spring.beans, spring.core;

}