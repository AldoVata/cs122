package classlab.week9;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseOdometer extends Application{
	Line line;
	Text distanceText;
	double distance = 0;
	double previousX = 0;
	double previousY = 0;

	public void start(Stage primaryStage) {
		line = new Line(0, 0, 0, 0);
		distanceText = new Text(500, 20, "Distance Travelled:  0");
			
		Group root = new Group(line, distanceText);
			
		Scene scene = new Scene(root, 1200, 800, Color.YELLOW);
		scene.setOnMouseMoved(this::processMouseMoved);
		primaryStage.setTitle("Mouse Odometer");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
		
		
		
		
	public static void main(String[] args) {
		launch(args);
	}
		
	public void processMouseMoved(MouseEvent event) {
		double movedX = event.getX();
		double movedY = event.getY();
		
		distance = Math.sqrt(movedX * previousX + movedY * previousY)/100 + distance; //I divided by 100 here so that the distance isn't crazy big

		String distanceStr = String.format("%.2f", distance);
		distanceText.setText("Distance:  " + distanceStr);
		previousX = movedX;
		previousY = movedY;
	}

}
