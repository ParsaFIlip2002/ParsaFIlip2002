

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Main extends Application implements EventHandler<ActionEvent> {

    //Buttons
    Button _sweKey;
    Button _japKey;

    //Flags
    Group _flagOfJapan = new Group();
    StackPane _flagOfSweden = new StackPane();

    //Define all main  elements 
    HBox _buttonBox = new HBox();
    Group _root = new Group(buttons());
    Scene _mainScene = new Scene(_root, 300, 200);
    Stage _window;

    @Override
    public void start(Stage window) throws Exception {
        _window = window;

        generateFlags();

        _window.setScene(_mainScene);

        _window.show();
    }

    private void generateFlags() {
        sweden();
        japan();
    }

    private HBox buttons(){
        _sweKey = new Button("Sweden");
        _sweKey.setOnAction(this);

        _japKey = new Button("Japan");
        _japKey.setOnAction(this);

        _buttonBox.getChildren().addAll(_sweKey);
        _buttonBox.getChildren().addAll(_japKey);

        return _buttonBox;
    }

    private void japan() {
        Circle circle = new Circle(140,100,75, Color.RED);
        Rectangle background = new Rectangle(100, 100, Color.WHITE);
    	

        _flagOfJapan.getChildren().addAll(background,circle);

        
    }

    private void sweden() {
    	Rectangle horizontalLine = new Rectangle(50, 200, Color.YELLOW);
    	Rectangle vericalLine = new Rectangle(300, 50, Color.YELLOW);
    	Rectangle background = new Rectangle(300, 200, Color.BLUE);
        

        _flagOfSweden.getChildren().addAll(background,horizontalLine, vericalLine);

        
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        if (actionEvent.getSource() == _sweKey) {
            if (_buttonBox.getChildren().contains(_flagOfJapan)){
                _buttonBox.getChildren().remove(_flagOfJapan);
            }

            _buttonBox.getChildren().add(_flagOfSweden);
            _window.setWidth(445);
            _window.setHeight(240);

            return;
        }

        if (actionEvent.getSource() == _japKey) {
            if (_buttonBox.getChildren().contains(_flagOfSweden)){
            _buttonBox.getChildren().remove(_flagOfSweden);
            }
            
            _buttonBox.getChildren().add(_flagOfJapan);
        	_mainScene.setFill(Color.BLACK);
            return;
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
