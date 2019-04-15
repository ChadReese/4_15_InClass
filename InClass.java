import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class InClass extends Application{


	public static void main(String[] args) {
		launch();
	}
	public void start(Stage primaryStage) throws Exception {
		HBox hb = new HBox();
		//horizontal box
		Button bHide = new Button("Hide");
		Button bShow = new Button("Show");
		ImageView imgPotato = new ImageView("http://www.smokingarlic.com/wp-content/uploads/2013/06/garlic-mashed-potatoes-638x345.jpg");
		
		hb.getChildren().addAll(imgPotato,bHide,bShow);
		
		Scene primaryScene = new Scene(hb,800, 800);
		primaryStage.setScene(primaryScene);
		primaryStage.show();
		
		bHide.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				imgPotato.setVisible(false);
			}
		});
	}
}