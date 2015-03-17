package org.aberrantaccord.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.aberrantaccord.reference.references;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource(references.strMainForm));
        primaryStage.setTitle(references.strTitle);
        primaryStage.setScene(new Scene(root, 640, 480));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
