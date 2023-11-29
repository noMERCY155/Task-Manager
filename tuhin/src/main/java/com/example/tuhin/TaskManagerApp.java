package com.example.tuhin;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;



public class TaskManagerApp {

    public void runTaskManager(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("taskmanager.fxml"));
        Parent root = loader.load();

        //TaskManagerController controller = loader.getController();

        primaryStage.setTitle("Task Manager App");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }
}
