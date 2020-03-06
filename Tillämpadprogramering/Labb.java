import com.sun.javafx.geom.Rectangle;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Labb extends Application{

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage window) throws Exception {
		
		Circle circle = new Circle();
		
		Group container = new Group(circle);
		
		Scene mainScene = new Scene(container, 300, 300);
		
		window.setScene(mainScene);
		
		window.show();		
	}
	private Group japan() {
		Circle circle = new Circle();
		circle.setRadius(75);
		circle.setFill(red);
		
		circle.setCenterX(150);
		circle.setCenterY(100);
		
		Group flagofJapan = new Group();
		
		return flagofJapan;
		
	}
	private StackPane sweden();
	
	Rectangle horizontalLine = new Rectangle( width
			300 );
	Rectangle veticalLine = new Rectangle();
	
	flagofSweden = new StackPane();
	
	

}
