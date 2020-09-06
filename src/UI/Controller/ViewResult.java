package UI.Controller;

import ABC_Manager.Serializer;
import ABC_Manager.Team;
import ABC_Manager.calculator.Calculator;
import ABC_Manager.calculator.HighBoundaries_Calculator;
import ABC_Manager.calculator.HighRun_Calculator;
import ABC_Manager.calculator.HighStrike_Calculator;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ViewResult implements Initializable {
    @FXML
    private Label runs;

    @FXML
    private Label boundary;

    @FXML
    private Label strike;

    private Team[] teams = new Team[2];
    private Serializer serializer = new Serializer();
    private Calculator calculator;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.teams = this.serializer.deserialization();
        this.calculator = new HighRun_Calculator(this.teams);
        this.runs.setText(this.calculator.calculate());

        this.calculator = new HighBoundaries_Calculator(this.teams);
        this.boundary.setText(this.calculator.calculate());

        this.calculator = new HighStrike_Calculator(this.teams);
        this.strike.setText(this.calculator.calculate());
    }
}
