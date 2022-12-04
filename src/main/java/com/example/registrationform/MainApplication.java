package com.example.registrationform;

import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.collections.*;
import javafx.geometry.*;

public class MainApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {

                // Name & TextField

        Label nameLabel = new Label("Name");
        TextField nameText = new TextField();

                //DOB & DatePicker

        Label dobLabel = new Label("Date of birth");
        DatePicker datePicker = new DatePicker();

                // Gender & RadioButtons

        Label genderLabel = new Label("Gender");
        ToggleGroup groupGender = new ToggleGroup();
        RadioButton maleRadio = new RadioButton("male");
        maleRadio.setToggleGroup(groupGender);
        RadioButton femaleRadio = new RadioButton("female");
        femaleRadio.setToggleGroup(groupGender);

                // Languages known & CheckBox

        Label languagesLabel = new Label("Languages Known");
        CheckBox javaCheckBox = new CheckBox("Java");
        javaCheckBox.setIndeterminate(false);
        CheckBox pythonCheckBox = new CheckBox("Python");
        javaCheckBox.setIndeterminate(false);

                // Educational Qualification & ListView

        Label educationLabel = new Label("Educational Qualification");
        ListView eduList = new ListView();
        ObservableList data = FXCollections.observableArrayList();
        data.addAll(new Object[]{"Bachelor's Degree", "Plus 2", "Master's Degree", "Phd."});
        eduList.setItems(data);
        eduList.setPrefSize(100.0, 100.0);

                // Location & ChoiceBox

        Label locationLabel = new Label("Location");
        ChoiceBox locationChoiceBox = new ChoiceBox();
        locationChoiceBox.getItems().addAll(new Object[]{"Bangalore", "Chennai", "Kolkata", "Mumbai", "New Delhi"});

                // Register Button

        Button buttonRegister = new Button("Register");

                // GridPane Alignment

        GridPane gridPane = new GridPane();
        gridPane.setMinSize(500.0, 400.0);
        gridPane.setPadding(new Insets(10.0, 10.0, 10.0, 10.0));
        gridPane.setVgap(5.0);
        gridPane.setHgap(5.0);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameText, 1, 0);
        gridPane.add(dobLabel, 0, 1);
        gridPane.add(datePicker, 1, 1);
        gridPane.add(genderLabel, 0, 2);
        gridPane.add(maleRadio, 1, 2);
        gridPane.add(femaleRadio, 2, 2);
        gridPane.add(languagesLabel, 0, 3);
        gridPane.add(javaCheckBox, 1, 3);
        gridPane.add(pythonCheckBox, 2, 3);
        gridPane.add(educationLabel, 0, 4);
        gridPane.add(eduList, 1, 4);
        gridPane.add(locationLabel, 0, 5);
        gridPane.add(locationChoiceBox, 1, 5);
        gridPane.add(buttonRegister, 2, 7);

                // Style

        buttonRegister.setStyle("-fx-background-color:darkslateblue; -fx-text-fill: white;");
        nameLabel.setStyle("-fx-font:normal bold 15px 'serif' ");
        dobLabel.setStyle("-fx-font:normal bold 15px 'serif' ");
        genderLabel.setStyle("-fx-font:normal bold 15px 'serif' ");
        languagesLabel.setStyle("-fx-font:normal bold 15px 'serif' ");
        educationLabel.setStyle("-fx-font:normal bold 15px 'serif' ");
        locationLabel.setStyle("-fx-font:normal bold 15px 'serif' ");
        gridPane.setStyle("-fx-background-color:BEIGE;");

        Scene scene = new Scene(gridPane);
        stage.setTitle("Registration From");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}