package application;

import application.launcher.Game;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainwindow.fxml"));
        primaryStage.setTitle("Launcher");
        Scene myScene = new Scene(root, 1600, 900);
        primaryStage.setScene(myScene);
        primaryStage.show();
    }


    public static void main(String[] args) throws Exception{
//        launch(args);
        Game rainbow = new Game("Rainbow Six Siege", "C:\\Program Files (x86)\\Steam\\steamapps\\common\\Tom Clancy's Rainbow Six Siege\\RainbowSix.exe");
        Game valorant = new Game("Valorant", "C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Riot Games");
        rainbow.launchGame();

    }
}
