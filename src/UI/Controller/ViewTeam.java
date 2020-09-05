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
        String id = teamId.getText();
        this.teams = serializer.deserialization();
        System.out.print(this.teams[1]);
        for(int counter = 0; counter < 2; counter++){
            if(this.teams[counter].getTeam_name() == id){
                playerNames.setText(this.teams[counter].getPlayers().toString());
            }
        }

    }
}
