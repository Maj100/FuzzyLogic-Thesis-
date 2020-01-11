package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	

	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			
			//BorderPane root = new BorderPane();
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene scene = new Scene(root,1580,820);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			//primaryStage.setMaximized(true);
			//primaryStage.setMinimumSize(new Dimension(400, 400));
			primaryStage.setTitle("A Multi-Criteria Decision Tool for Cloud and Fog Coordination");

			
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}
	
}

