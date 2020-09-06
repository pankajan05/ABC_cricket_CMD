package UI.Controller;

import ABC_Manager.Serializer;
import ABC_Manager.Team;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ViewTeam {
    @FXML
    private TextField teamId;

    @FXML
    private Button search;

    @FXML
    private Label playerNames;
    private Serializer serializer = new Serializer();
    private Team[] teams;

    @FXML
    void search(MouseEvent event) {
        String id = this.teamId.getText();
        String text = "No Player is found";
        this.playerNames.setText(text);
        this.teams = serializer.deserialization();
        for(int counter = 0; counter < 2; counter++){
            if(this.teams[counter].getTeam_name().equals(id) ){
                text = "";
                for(int counter_p = 0; counter_p<2; counter_p++)
                    text += this.teams[counter].players[counter_p].getPlayer_name() + " -> " + this.teams[counter].players[counter_p].getRole() + "\n";
                this.playerNames.setText(text);
            }
        }

    }
}
