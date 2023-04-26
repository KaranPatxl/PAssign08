package ch14;
/**
 * File: PAssign08.java
 * Class: CSCI 1302
 * Author: Karan Patel
 * Created on: Apr 22, 2023
 * Last Modified:  Apr 25, 2023
 * Description: KeyPanePadCustom
 */
import ch14.KeyPadPane;
import ch14.KeyPadPanePlus;
import ch14.KeyPadCustomPane;
import javafx.scene.layout.BorderPane;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import java.util.ArrayList;
import java.util.Arrays;
public class PAssign08 extends Application{
	protected TextField Result = new TextField("Press a Number");

	public void start(Stage primaryStage) {
		//KeyPane
		BorderPane mainPane = new BorderPane();
		KeyPadCustomPane key = new KeyPadCustomPane();
		mainPane.setCenter(key);
		mainPane.setTop(Result);
		Result.setEditable(false);
		
		//The PrimaryStage Title  and scene
		primaryStage.setTitle("Number Pad"); 
		Scene scene = new Scene(mainPane, 350, 350);
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}
	public static void main(String[] args) {
		launch(args);
	}
}
