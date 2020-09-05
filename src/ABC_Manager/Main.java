package ABC_Manager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../UI/FXML/home.fxml"));
        primaryStage.setTitle("ABC Cricket Tournament");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();


    }


    public static void main(String[] args) {
        ABC_Manager manager = new ABC_Manager();
        manager.manage();

        //launch(args);
    }
}
