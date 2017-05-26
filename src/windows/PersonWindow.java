package windows;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PersonWindow extends Application {

	

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene secondScene = new Scene(new Group());
		primaryStage.setTitle("Personal Data");
		Label nameLabel = new Label("Name");
		Label surnameLabel = new Label("Surname");
		TextField textField = new TextField();
		
		primaryStage.setScene(secondScene);
		primaryStage.show();
		
	}
	
	
}
