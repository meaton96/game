package control;

import entities.Player;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Controller {

    private static final int WIDTH = 900;
    private static final int HEIGHT = 450;

    //private final Application app;
    private final Stage primaryStage;
    private Player player;
    private String styleSheet;

    public void start() {
        styleSheet = this.getClass().getResource("styles/style.css").toExternalForm();
        mainMenu();
        primaryStage.show();
        //loadBattleStage();
    }

    public void mainMenu() {
        StackPane mainMenuPane = new StackPane();
        mainMenuPane.setId("main_menu");
        Scene menuScene = new Scene(mainMenuPane, WIDTH, HEIGHT);
        menuScene.getStylesheets().addAll(styleSheet);
        primaryStage.setScene(menuScene);
    }

    public void loadBattleStage() {
        StackPane battlePane = new StackPane();
        battlePane.setId("hills_battle");
        Scene battleScene = new Scene(battlePane, WIDTH, HEIGHT);
        primaryStage.setScene(battleScene);
        battleScene.getStylesheets().addAll(styleSheet);
        primaryStage.show();
    }

}
