package Darkmode;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Menu extends Application {

	
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Dark.fxml"));
			Scene scene = new Scene(root,1300,900);
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("A Multi-Criteria Decision Tool");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);

		
	}
	
	  
	

	
}










