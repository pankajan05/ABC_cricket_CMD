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

    private Serializer serializer = new Serializer();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Team[] teams = this.serializer.deserialization();
        Calculator calculator = new HighRun_Calculator(teams);
        this.runs.setText(calculator.calculate());

        calculator = new HighBoundaries_Calculator(teams);
        this.boundary.setText(calculator.calculate());

        calculator = new HighStrike_Calculator(teams);
        this.strike.setText(calculator.calculate());
    }
}
