package windows;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FirstWindow extends Application implements EventHandler<ActionEvent>{

	Button button;
	PersonWindow personWindow;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception  {
		primaryStage.setTitle("Family Tree");
		
		button = new Button ("Dodaj kogos");
		button.setOnAction(this);
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 250, 250);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void handle(ActionEvent event) {
		if (event.getSource()== button){
			PersonWindow personWindow = new PersonWindow();
		}
		
	}

}
