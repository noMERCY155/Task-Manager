package com.example.tuhin;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplicationDriver extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
        TaskManagerApp app = new TaskManagerApp();
        app.runTaskManager(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}