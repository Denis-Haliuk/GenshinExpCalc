package com.haliuk.genshinexpcalc;

import com.haliuk.genshinexpcalc.service.ExperienceCalculator;
import com.haliuk.genshinexpcalc.service.ExperienceCalculatorImpl;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.List;

public class HelloController {
    public ChoiceBox<Integer> lvlSelector;

    public Group root;
    public TextField purpleBooksAmount;
    ExperienceCalculatorImpl experienceCalculator = new ExperienceCalculatorImpl();

    ObservableList<Integer> lvlList = FXCollections.observableArrayList(1, 20, 40, 50, 60, 70, 80, 90);

    public TextField enteredExp;

    public void onClick(MouseEvent mouseEvent) {
        lvlSelector.setItems(lvlList);
    }

    public void btnCalculate(ActionEvent actionEvent) {

        int enteredExp;
        if(this.enteredExp.getText().equals("")){
            enteredExp = 0;
        } else {
            enteredExp = Integer.parseInt(this.enteredExp.getText());
        }
        purpleBooksAmount.setText(String.valueOf(experienceCalculator.CalculateNeededPurpleBooks(enteredExp, lvlSelector.getValue())));

    }
}