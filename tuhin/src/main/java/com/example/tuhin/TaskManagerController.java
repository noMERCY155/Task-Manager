package com.example.tuhin;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class TaskManagerController {

    @FXML
    private ListView<String> taskListView;

    @FXML
    private TextField taskInputField;

    @FXML
    private Button addButton;

    @FXML
    private Button markDoneButton;

    @FXML
    private Button removeDoneButton;

    @FXML
    private Button markImportantButton;


    @FXML
    private void addTask() {
        String taskText = taskInputField.getText().trim();
        if (!taskText.isEmpty()) {
            taskListView.getItems().add(taskText);
            taskInputField.clear();
        }
    }

    @FXML
    private void markDone() {
        int selectedIndex = taskListView.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            String task = taskListView.getItems().get(selectedIndex);
            if(!task.startsWith("✓")) {
                task = "✓ " + task;
                taskListView.getItems().set(selectedIndex, task);
            }
        }
    }

    @FXML
    private void removeDone() {
        taskListView.getItems().removeIf(task -> task.startsWith("✓"));
    }

    @FXML
    private void markImportant() {
        int selectedIndex = taskListView.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            String task = taskListView.getItems().get(selectedIndex);
            task = task + "★ ";
            taskListView.getItems().set(selectedIndex, task);
        }
    }
    private int getSerial(){
        return taskListView.getItems().size()+1;//TODO:Fix the issue with removing(After removing a task the serial gets messed up)
    }
}
