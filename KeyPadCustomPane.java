package ch14;
/**
 * File: KeyPadCustomPane.java
 * Class: CSCI 1302
 * Author: Karan Patel
 * Created on: Apr 22, 2023
 * Last Modified:  Apr 25, 2023
 * Description: KeyPanePadCustom
 */
import java.util.ArrayList;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.util.ArrayList;

public class KeyPadCustomPane extends KeyPadPane {
	//Label
	protected Label label = new Label("Button pressed");
	protected TextField Result = new TextField();


	//Method
	protected void registerEventHandlers() {
		ArrayList<Button> currList = new ArrayList<Button>();
		currList = (copyListButtons != null) ? copyListButtons : listButtons;

		//handlers for all Buttons
		for (int i = 0; i < currList.size(); i++) {
			currList.get(i).setPrefSize(200, 150);;
			currList.get(i).setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {
					System.out.println("Button was clicked: " + ((Button)e.getSource()).getText());
				}
			});
			currList.get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent mouseEvent) {
					if(mouseEvent.getButton().equals(MouseButton.PRIMARY)){
						btn0.setStyle("-fx-background-color: #2E8B57; -fx-text-fill:white;");
						btn1.setStyle("-fx-background-color: #000000; -fx-text-fill: white;");
						btn2.setStyle("-fx-background-color: #2E8B57; -fx-text-fill: white;");
						btn3.setStyle("-fx-background-color: #000000; -fx-text-fill: white;");
						btn4.setStyle("-fx-background-color: #2E8B57; -fx-text-fill: white;");
						btn5.setStyle("-fx-background-color: #000000; -fx-text-fill: white;");
						btn6.setStyle("-fx-background-color: #2E8B57; -fx-text-fill: white;");
						btn7.setStyle("-fx-background-color: #000000; -fx-text-fill: white;");
						btn8.setStyle("-fx-background-color: #2E8B57; -fx-text-fill: white;");
						btn9.setStyle("-fx-background-color: #000000; -fx-text-fill: white");
						if(mouseEvent.getClickCount() == 2){
							System.out.println("Double clicked");
							btn0.setStyle("-fx-background-color:  ");
							btn1.setStyle("-fx-background-color: ");
							btn2.setStyle("-fx-background-color: ");
							btn3.setStyle("-fx-background-color: ");
							btn4.setStyle("-fx-background-color: ");
							btn5.setStyle("-fx-background-color: ");
							btn6.setStyle("-fx-background-color: ");
							btn7.setStyle("-fx-background-color: ");
							btn8.setStyle("-fx-background-color: ");
							btn9.setStyle("-fx-background-color: ");
						}
					}
				}
			});
		}
	}
}