package windows;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.Sex;

public class PersonWindow extends Application {

	private ChoiceBox sexChoice;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		GridPane gridPane = new GridPane();
		//Padding wokol tabeli
		gridPane.setPadding(new Insets (25,0,50,50));
		//Padding horyzontalny
		gridPane.setHgap(10);
		Stage primaryStage1 = new Stage();
		Scene secondScene = new Scene(gridPane, 400, 400);
		
		primaryStage1.setTitle("Personal Data");
		//NAME
		Label nameLabel = new Label("Name");
		gridPane.add(nameLabel, 0, 0);
		TextField nameTextField = new TextField();
		gridPane.add(nameTextField, 0, 1);
		
		//SURENAME
		Label surnameLabel = new Label("Surename");
		gridPane.add(surnameLabel, 0, 2);
		TextField surnameTextField = new TextField();
		gridPane.add(surnameTextField, 0, 3);
		
		//BIRTHDATE
		Label birthdateLabel = new Label("Birth date");
		gridPane.add(birthdateLabel, 0, 4);
		TextField birthdateTextField = new TextField();
		gridPane.add(birthdateTextField, 0, 5);
		
		//DEATHDATE
		Label deathdateLabel = new Label("Death date");
		gridPane.add(deathdateLabel, 0, 6);
		TextField deathdateTextField = new TextField();
		gridPane.add(deathdateTextField, 0, 7);
		
		ChoiceBox sexChoice = new ChoiceBox();
		sexChoice.setItems(FXCollections.observableArrayList("Male", "Female"));
		//SEX
		Label sexLabel = new Label("Male/Female");
		gridPane.add(sexLabel, 2, 0);
		gridPane.add(sexChoice, 2, 1);
//		TextField sexTextField = new TextField();
//		gridPane.add(sexTextField, 2, 1);
		
		
		primaryStage1.setScene(secondScene);
		primaryStage1.show();
		
	}

	
	
	
}
