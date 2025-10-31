package com.mik.unreal.editor.tool.uelocreseditorfx.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.mik.unreal.editor.tool.uelocreseditorfx.*"})
public class SpringHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringHelloApplication.class, args);
    }

}
