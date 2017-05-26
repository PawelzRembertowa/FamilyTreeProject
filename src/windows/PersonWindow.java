package windows;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PersonWindow extends Application {

	

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane gridPane = new GridPane();
		Group root = new Group();
		Stage primaryStage1 = new Stage();
		Scene secondScene = new Scene(root, 500, 500);
		
		primaryStage1.setTitle("Personal Data");
		Label nameLabel = new Label("Name");
		Label surnameLabel = new Label("Surname");
		TextField nameTextField = new TextField();
		TextField surnameTextField = new TextField();
		
		root.getChildren().add(nameLabel);
		root.getChildren().add(nameTextField);
		root.getChildren().add(surnameLabel);
		root.getChildren().add(surnameTextField);
		
		
		primaryStage1.setScene(secondScene);
		primaryStage1.show();
		
	}

	
	
	
}
