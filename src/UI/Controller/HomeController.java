package UI.Controller;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {



    @FXML
    private AnchorPane holderPane;

    AnchorPane home;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.createPage();
    }

    private void setNode(Node node) {
        holderPane.getChildren().clear();
        holderPane.getChildren().add((Node) node );

        FadeTransition ft = new FadeTransition(Duration.millis(1500));
        ft.setNode(node);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    private void createPage() {
        try {
            home = FXMLLoader.load(getClass().getResource("../FXML/ViewMatchInfo.fxml"));
            setNode(home);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void viewMatch(MouseEvent event) {
        try {
            home = FXMLLoader.load(getClass().getResource("../FXML/ViewMatchInfo.fxml"));
            setNode(home);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void viewPlayer(MouseEvent event) {
        try {
            home = FXMLLoader.load(getClass().getResource("../FXML/ViewPlayer.fxml"));
            setNode(home);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void viewResult(MouseEvent event) {
        try {
            home = FXMLLoader.load(getClass().getResource("../FXML/ViewResult.fxml"));
            setNode(home);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void viewTeam(MouseEvent event) {
        try {
            home = FXMLLoader.load(getClass().getResource("../FXML/ViewTeams.fxml"));
            setNode(home);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
