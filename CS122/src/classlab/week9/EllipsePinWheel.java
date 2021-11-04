package classlab.week9;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class EllipsePinWheel extends Application{

	public void start(Stage primaryStage) {
		Group root = new Group();
		int centerX = 450;
		int centerY = 450;
		for(int i = 0; i<360;i+=5) {
			Ellipse e = new Ellipse(centerX,centerY,70,50);
			e.setRotate(i);
			if(i%2==0)
				e.setFill(Color.GREEN);
			else if(i%3==0)
				e.setFill(Color.RED);
			else if(i%4==0)
				e.setFill(Color.BLACK);
			else if(i%5==0)
				e.setFill(Color.BLUE);
			
			root.getChildren().add(e);
		}
		
		Scene scene = new Scene(root, 900, 900, Color.WHITE);
		primaryStage.setTitle("Ellipse PinWheel");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
