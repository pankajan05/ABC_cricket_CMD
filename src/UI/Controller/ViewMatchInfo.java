package UI.Controller;

import ABC_Manager.Serializer;
import ABC_Manager.Team;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ViewMatchInfo implements Initializable {
    @FXML
    private Label matchInfo;
    private Serializer serializer = new Serializer();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String matchInfo = "ABC cricket tournament is an annual tournament which will be held in 4 venues. \nTen school teams are" +
                "invited to join the competition and each team has 11 players.\n\n";
        Team[] teams = serializer.deserialization();;

        matchInfo += "Participated Teams : \n\n";
        for(int counter = 0; counter < 2; counter++){
            matchInfo += teams[counter].getTeam_name() + "\n";
        }
        this.matchInfo.setText(matchInfo);
    }
}
