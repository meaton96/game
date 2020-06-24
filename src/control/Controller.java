package control;

import entities.Player;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import javafx.scene.layout.VBox;


@RequiredArgsConstructor
public class Controller {

    private static final int WIDTH = 1440;
    private static final int HEIGHT = 810;
    
    private Font gameFont;

    //private final Application app;
    private final Stage primaryStage;
    private Player player;
    private String styleSheet;
    

    public void start() {
        gameFont = Font.loadFont(getClass().getResourceAsStream("styles/res/immortal.ttf"), 40);
        
        styleSheet = getClass().getResource("styles/style.css").toExternalForm();
        mainMenu();
        primaryStage.show();
        //loadBattleStage();
    }

    public void mainMenu() {
        VBox mainMenuPane = new VBox(50);
        mainMenuPane.setId("main_menu");
        mainMenuPane.setAlignment(Pos.CENTER);
        
    
        Button start = new Button("Start");
        start.setId("start_button");
        start.setPrefSize(WIDTH / 8.0, HEIGHT / 8.0);
        start.setFont(gameFont);
        start.setTextFill(Color.rgb(255, 255, 255));
        
        
        Label rules = new Label("Insert rules/instructions here!!");
        mainMenuPane.getChildren().addAll(start, rules);
        
        
        Scene menuScene = new Scene(mainMenuPane, WIDTH, HEIGHT);
        menuScene.getStylesheets().addAll(styleSheet);
        primaryStage.setScene(menuScene);
    
        start.setOnAction(actionEvent -> {
            characterSelect(menuScene);
        });
    }
    
    public void characterSelect(Scene scene) {
        VBox vBox = new VBox(20);
        HBox hBox = new HBox(20);
        HBox hbox1 = new HBox(20);
        
        vBox.setId("main_menu");
        vBox.setAlignment(Pos.CENTER);
        hbox1.setAlignment(Pos.CENTER);
        hBox.setAlignment(Pos.CENTER);
        
        Button class1 = new Button("Warrior");
        Button class2 = new Button("Rogue");
        Button class3 = new Button("Mage");
        
        Label class1Label = new Label("Insert info about the class");
        Label class2Label = new Label("Insert info about the class");
        Label class3Label = new Label("Insert info about the class");
        
        hBox.getChildren().addAll(class1, class2, class3);
        hbox1.getChildren().addAll(class1Label, class2Label, class3Label);
        
        
        vBox.getChildren().addAll(hBox, hbox1);
        
        scene.setRoot(vBox);
        
    }
    

    public void loadBattleStage() {
        StackPane battlePane = new StackPane();
        battlePane.setId("hills_battle");
        Scene battleScene = new Scene(battlePane, WIDTH, HEIGHT);
        primaryStage.setScene(battleScene);
        battleScene.getStylesheets().addAll(styleSheet);
        //primaryStage.show();
    }

}
