package classlab.week6;

import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;

public class ImageDisplay extends Application{

	public void start(Stage primaryStage) {
		Image img = new Image("file:src/NgoloKante.jpg");
		ImageView imgView = new ImageView(img);

		StackPane pane = new StackPane(imgView);
		pane.setStyle("-fx-background-color: blue");
		imgView.setViewport(new Rectangle2D(0, 0, 250, 225));
      
		Scene scene = new Scene(pane, 700, 550);

		primaryStage.setTitle("Image Display");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);

	}

}
