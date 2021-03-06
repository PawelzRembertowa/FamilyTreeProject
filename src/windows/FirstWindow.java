package windows;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.Person;

public class FirstWindow extends Application implements EventHandler<ActionEvent>{

	public Button button;
	private PersonWindow personWindow;
	private Stage notprimaryStage;
	private Stage primaryStage;
	
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
		
		
		//primaryStage.close();
	}

	@Override
	public void handle(ActionEvent event) {
		if (event.getSource()== button){
			//znikanie pierwszego okna
			Stage primaryStage = (Stage) button.getScene().getWindow();
		    primaryStage.close();
			//pojawianie sie kolejnego
		    personWindow = new PersonWindow();
			try {
				personWindow.start(notprimaryStage);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}
		
	}

}
