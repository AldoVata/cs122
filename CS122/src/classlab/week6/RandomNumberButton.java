package classlab.week6;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.application.Application;

public class RandomNumberButton extends Application{
	private int rand;
	private Text randText;
	
	@Override
	public void start(Stage primaryStage) {
		rand = (int)(Math.random()*6);
		randText = new Text("Random Number: ?");

		Button push = new Button("Push Me!");
		push.setOnAction((event) -> {
			randText.setText("Random Number: " + rand);
			rand = (int)(Math.random()*6);
		});

		FlowPane pane = new FlowPane(push, randText);
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(20);
		pane.setStyle("-fx-background-color: orange");

		Scene scene = new Scene(pane, 300, 100);

		primaryStage.setTitle("Random Number Generator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
