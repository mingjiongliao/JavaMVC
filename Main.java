//student name: Mingjiong Liao, student number: 1896048
package application;

import java.util.ArrayList;

import application.controller.Controller;
import application.model.Colour;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	private ArrayList<Colour> cl;

	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader fxml = new FXMLLoader(getClass().getResource("view/View.fxml"));
			Controller controller = new Controller();
			fxml.setController(controller);
			Parent root = fxml.load();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
