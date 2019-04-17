import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class Shapes extends Application{
	
	public static void main(String[] args) {
		launch();
	}
	
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		pane.setStyle("-fx-background-color: green");
		//create a rectangle
		Rectangle box = new Rectangle(100,100);
		box.setLayoutX(100);
		box.setLayoutY(100);
		box.setFill(Color.BLUE);
		box.setStroke(Color.AQUA);
		//add circle
		Circle circle = new Circle();
		circle.setCenterX(200);
		circle.setCenterY(200);
		circle.setRadius(20);
		//add Polygon
		Polygon pentagon = new Polygon();
		pentagon.getPoints().addAll(new Double[] {
				300.0, 300.0,
				250.0, 350.0,
				250.0, 400.0,
				350.0, 400.0,
				350.0, 350.0
		});
		pentagon.setFill(Color.CRIMSON);
		pentagon.setStroke(Color.DARKRED);
		//add line
		Line line = new Line();
		line.setStartX(10);
		line.setStartY(25);
		line.setEndX(50);
		line.setEndY(65);
		//add to container
		pane.getChildren().addAll(box,circle,pentagon,line);
		//create scene
		Scene mainScene = new Scene(pane,800,800);
		//add to stage
		primaryStage.setScene(mainScene);
		primaryStage.setTitle("My shapes");
		//show the stage
		primaryStage.show();
	}
}
