package classlab.week7;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Shear;
import javafx.stage.Stage;

import java.util.Random;

public class RandomRectangles extends Application{
	
	public void start(Stage primaryStage){	
		Group root = new Group();
		Random gen = new Random();
		
		for(int i = 1; i<=20; i++)
		{
			int x = gen.nextInt(351) + 1;
			int y = gen.nextInt(351) + 1;
			
			int width = gen.nextInt(141) + 10;
			int height = gen.nextInt(141) + 10;
			
			Rectangle box = new Rectangle(x, y, width, height);
			box.setStroke(Color.WHITE);
			
			Color fill = null;
			if (i%2==0)
			{
				box.setRotate(20);
			}
			if (i%3==0)
			{
				box.setTranslateX(20);
				box.setTranslateY(20);
			}
			if(i%5==0)
			{
				box.getTransforms().add(new Shear(0.5,0.5));
			}
			box.setFill(fill);
			
			root.getChildren().add(box);
		}
		Scene scene = new Scene(root, 600, 600, Color.BLACK);

		primaryStage.setTitle("RandomBoxes");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args)
	{
		launch(args);
	}
}

