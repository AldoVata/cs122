package classlab.week5;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FirstJavaFxCode extends Application {
	// --------------------------------------------------------------------
	// Creates and displays two Text objects in a JavaFX window.
	// --------------------------------------------------------------------
	public void start(Stage primaryStage) {
		Text hello = new Text(240, 120, "Aldo Vata");

		Group root = new Group(hello);
		Scene scene = new Scene(root, 480, 240, Color.PURPLE);

		primaryStage.setTitle("A JavaFX Program");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	// --------------------------------------------------------------------
	// Launches the JavaFX application. This method is not required
	// in IDEs that launch JavaFX applications automatically.
	// --------------------------------------------------------------------
	public static void main(String[] args) {
		launch(args);
	}
}

