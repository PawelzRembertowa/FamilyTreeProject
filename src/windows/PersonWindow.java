package windows;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

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


public class PersonWindow extends Application {

	private ChoiceBox sexChoice;

	@Override
	public void start(Stage personStage) throws Exception {
		
		GridPane gridPane = new GridPane();
		//Padding wokol tabeli
		gridPane.setPadding(new Insets (25,0,50,50));
		//Padding horyzontalny
		gridPane.setHgap(10);
		Stage primaryStage1 = new Stage();
		Scene secondScene = new Scene(gridPane, 400, 400);
		
		
		//poprzednia metoda	z ArrayLista
//		ArrayList<Integer> yearList = new ArrayList<Integer>();
//		for (int years = 1700; years <=2020; years++){
//			yearList.add(years);
		
		
//		JComboBox<Integer> yearBox = new JComboBox<Integer>();
//		yearBox.setModel(new DefaultComboBoxModel<Integer>(yearList.toArray(new Integer[1700])));

		ArrayList<Integer> yearsList = new ArrayList(320);
		int year_end = 2021;
		System.out.println("Inicjalizujemy Araj Liste");
		for (int y = 1700; y < year_end; y++){
			yearsList.add(y);
		}
	
//		JComboBox yearBox = new JComboBox();
//		yearBox.addItem(yearsList);
		
		
		
		primaryStage1.setTitle("Personal Data");
		//NAME
		Label nameLabel = new Label("Name");
		gridPane.add(nameLabel, 0, 0);
		TextField nameTextField = new TextField();
		gridPane.add(nameTextField, 0, 1);
		
		//SURENAME
		Label surnameLabel = new Label("Surname");
		gridPane.add(surnameLabel, 0, 2);
		TextField surnameTextField = new TextField();
		gridPane.add(surnameTextField, 0, 3);
		
		//BIRTHDATE
		Label birthdateLabel = new Label("Birth date");
		gridPane.add(birthdateLabel, 0, 4);
		//yearBox.setSelectedItem(yearsList);
		
		ChoiceBox yearsChoice = new ChoiceBox();
		yearsChoice.setItems(FXCollections.observableArrayList(yearsList));
		gridPane.add(yearsChoice, 0, 5);
	
		
		//DEATHDATE
		Label deathdateLabel = new Label("Death date");
		gridPane.add(deathdateLabel, 0, 6);
		ChoiceBox yearsChoice1 = new ChoiceBox();
		yearsChoice1.setItems(FXCollections.observableArrayList(yearsList));
		yearsChoice1.minHeight(250);
		gridPane.add(yearsChoice1, 0, 7);
		
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
