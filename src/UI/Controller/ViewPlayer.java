package UI.Controller;

import ABC_Manager.Serializer;
import ABC_Manager.Team;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ViewPlayer {
    @FXML
    private Button search;

    @FXML
    private TextField teamId;

    @FXML
    private TextField playerId;

    @FXML
    private Label playerInfo;
    private Team[] teams = new Team[10];
    private Serializer serializer = new Serializer();

    @FXML
    void Search(MouseEvent event) {
        String t_id = this.teamId.getText();
        String p_id = this.playerId.getText();
        String text = "Enter team name and player id";
        this.playerInfo.setText(text);

        this.teams = serializer.deserialization();
        for(int counter = 0; counter < teams.length; counter++){
            if(this.teams[counter].getTeam_name().equals(t_id) ){
                for(int counter_p = 0; counter_p< teams[counter].players.length; counter_p++)
                    if(Integer.parseInt(p_id) == this.teams[counter].players[counter_p].getPlayer_id()) {
                        text = "";
                        text += this.teams[counter].players[counter_p] ;
                        this.playerInfo.setText(text);
                    }
            }
        }

    }
}
