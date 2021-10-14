package com.example.fxapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {

    private double xOffset = 0;
    private double yOffset = 0;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        stage.initStyle(StageStyle.TRANSPARENT);
        Parent root = fxmlLoader.load();
        root.setOnMousePressed(event -> {
            root.setOnMouseDragged(dragEvent -> {
                stage.setX(dragEvent.getScreenX() - event.getSceneX());
                stage.setY(dragEvent.getScreenY() - event.getSceneY());
            });
        });
        stage.setAlwaysOnTop(true);
        Scene scene = new Scene(root, 320, 400);
        scene.setFill(Color.TRANSPARENT);
        stage.setTitle("SuperApp!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}