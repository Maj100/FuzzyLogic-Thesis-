package Darkmode;

import java.awt.Frame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.Stream;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXSlider;
import com.jfoenix.controls.JFXTextField;

import Help.Help1;
import application.Main;
import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import javafx.util.Duration;
import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;

public class MenuController implements Initializable {

	private static final double INIT_VALUE1 = 0;
	private static final double INIT_VALUE = 5;
	@FXML
	JFXButton clickme, clickme1, browse, sensegas;
	@FXML
	JFXTextField option1, option2, option3, option4, option5, option6, box, sizefield, numbercount, streaming,
			sensitivefield, result, path, location1, degrees, output, co2, emptypurpose;

	@FXML
	TextArea showresults;
	@FXML
	TextField randomhide, randomhide2;

	@FXML
	JFXRadioButton radioconcern, radiodanger, WeakPivot, StrongPivot;

	@FXML
	RadioButton radiooff, radiooff1;

	@FXML
	JFXSlider slider1, slider2, slider3, slider4, slider5, slider6, slider7;

	@FXML
	Label lbloff, lblslow, lblmid, lblfast, lbllightstop, lbllightstop2, lbllight, lbllight2, lbltraffic, sensoron,
			sensoroff, concern1, concern2, safe1, safe2, danger1, danger2, danger3, danger4, sensoron2, on, on1, on2,
			off, off1, off2, pointer, sen1, sen, examplelabel, sensorimage, actuatingimage, communicateimage, lblslow1,
			lblmid1, lblfast1, errorfan1, fanmsg, titleofmenu;

	@FXML
	private Pane border1, border2, border3, border4;

	@FXML
	private AnchorPane menupane, panell1, panell2, panell3, panell4;

	@FXML
	JFXButton menubutton1, menubutton2, menubutton3, menubutton4, closewindowbutton;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		border1.setStyle("-fx-background-color: #696969; -fx-background-radius: 30 30 30 30; -fx-opacity: 0.5;");
		border1.setOnMouseEntered(e -> border1.setStyle(
				"-fx-background-color:#99aab5; -fx-background-radius: 30 30 30 30; -fx-scale-x: 1.2; -fx-scale-y: 1.2; -fx-scale-z: 1.2;"));
		border1.setOnMouseExited(e -> border1
				.setStyle("-fx-background-color: #696969; -fx-background-radius: 30 30 30 30; -fx-opacity: 0.5;"));

		border2.setStyle("-fx-background-color: #696969; -fx-background-radius: 30 30 30 30; -fx-opacity: 0.5;");
		border2.setOnMouseEntered(e -> border2.setStyle(
				"-fx-background-color:#99aab5; -fx-background-radius: 30 30 30 30; -fx-scale-x: 1.2; -fx-scale-y: 1.2; -fx-scale-z: 1.2;"));
		border2.setOnMouseExited(e -> border2
				.setStyle("-fx-background-color: #696969; -fx-background-radius: 30 30 30 30; -fx-opacity: 0.5;"));

		border3.setStyle("-fx-background-color: #696969; -fx-background-radius: 30 30 30 30; -fx-opacity: 0.5;");
		border3.setOnMouseEntered(e -> border3.setStyle(
				"-fx-background-color:#99aab5; -fx-background-radius: 30 30 30 30; -fx-scale-x: 1.2; -fx-scale-y: 1.2; -fx-scale-z: 1.2;"));
		border3.setOnMouseExited(e -> border3
				.setStyle("-fx-background-color: #696969; -fx-background-radius: 30 30 30 30; -fx-opacity: 0.5;"));

		border4.setStyle("-fx-background-color: #696969; -fx-background-radius: 30 30 30 30; -fx-opacity: 0.5;");
		border4.setOnMouseEntered(e -> border4.setStyle(
				"-fx-background-color:#99aab5; -fx-background-radius: 30 30 30 30; -fx-scale-x: 1.2; -fx-scale-y: 1.2; -fx-scale-z: 1.2;"));
		border4.setOnMouseExited(e -> border4
				.setStyle("-fx-background-color: #696969; -fx-background-radius: 30 30 30 30; -fx-opacity: 0.5;"));

		fadeIn1.setNode(panell1);
		fadeIn2.setNode(panell2);
		fadeIn3.setNode(panell3);
		fadeIn4.setNode(panell4);

		fadeIn1.setFromValue(0.0);
		fadeIn1.setToValue(1.0);
		fadeIn1.setCycleCount(1);
		fadeIn1.setAutoReverse(false);

		fadeIn2.setFromValue(0.0);
		fadeIn2.setToValue(1.0);
		fadeIn2.setCycleCount(1);
		fadeIn2.setAutoReverse(false);

		fadeIn3.setFromValue(0.0);
		fadeIn3.setToValue(1.0);
		fadeIn3.setCycleCount(1);
		fadeIn3.setAutoReverse(false);

		fadeIn4.setFromValue(0.0);
		fadeIn4.setToValue(1.0);
		fadeIn4.setCycleCount(1);
		fadeIn4.setAutoReverse(false);

		combobox.setItems(list);

		slider1.setValue(INIT_VALUE);
		option1.setText(new Double(INIT_VALUE).toString());
		option1.textProperty().bindBidirectional(slider1.valueProperty(), NumberFormat.getNumberInstance());

		slider2.setValue(INIT_VALUE);
		option2.setText(new Double(INIT_VALUE).toString());
		option2.textProperty().bindBidirectional(slider2.valueProperty(), NumberFormat.getNumberInstance());

		slider3.setValue(INIT_VALUE);
		option3.setText(new Double(INIT_VALUE).toString());
		option3.textProperty().bindBidirectional(slider3.valueProperty(), NumberFormat.getNumberInstance());

		slider4.setValue(INIT_VALUE);
		option4.setText(new Double(INIT_VALUE).toString());
		option4.textProperty().bindBidirectional(slider4.valueProperty(), NumberFormat.getNumberInstance());

		slider5.setValue(INIT_VALUE);
		option5.setText(new Double(INIT_VALUE).toString());
		option5.textProperty().bindBidirectional(slider5.valueProperty(), NumberFormat.getNumberInstance());

		slider6.setValue(INIT_VALUE);
		option6.setText(new Double(INIT_VALUE).toString());
		option6.textProperty().bindBidirectional(slider6.valueProperty(), NumberFormat.getNumberInstance());

		slider7.setValue(INIT_VALUE1);
		co2.setText(new Double(INIT_VALUE1).toString());
		co2.textProperty().bindBidirectional(slider7.valueProperty(), NumberFormat.getNumberInstance());

		option1.setStyle("-fx-text-fill: white; -fx-background-color: #777777;");
		option2.setStyle("-fx-text-fill: white; -fx-background-color: #777777;");
		option3.setStyle("-fx-text-fill: white; -fx-background-color: #777777;");
		option4.setStyle("-fx-text-fill: white; -fx-background-color: #777777;");
		option5.setStyle("-fx-text-fill: white; -fx-background-color: #777777;");
		option6.setStyle("-fx-text-fill: white; -fx-background-color: #777777;");
		box.setStyle("-fx-text-fill: white; -fx-background-color: #777777;");
		sizefield.setStyle("-fx-text-fill: white; -fx-background-color: #777777;");
		numbercount.setStyle("-fx-text-fill: white; -fx-background-color: #777777;");
		streaming.setStyle("-fx-text-fill: white; -fx-background-color: #777777;");
		sensitivefield.setStyle("-fx-text-fill: white; -fx-background-color: #777777;");
		result.setStyle("-fx-text-fill: white; -fx-background-color: #777777;");
		path.setStyle("-fx-text-fill: white; -fx-background-color: #777777;");
		location1.setStyle("-fx-text-fill: white; -fx-background-color: #777777;");
		degrees.setStyle("-fx-text-fill: white; -fx-background-color: #777777;");
		output.setStyle("-fx-text-fill: white; -fx-background-color: #777777;");
		combobox.setStyle("-fx-text-fill: white");

	}

	private FadeTransition fadeIn1 = new FadeTransition(Duration.millis(1000));
	private FadeTransition fadeIn2 = new FadeTransition(Duration.millis(1000));    //Allows for the animated transition when moving to another menu
	private FadeTransition fadeIn3 = new FadeTransition(Duration.millis(1000));
	private FadeTransition fadeIn4 = new FadeTransition(Duration.millis(1000));

	@FXML
	private void OpenPanel(ActionEvent event) {

		if (event.getSource() == menubutton1) { 

			if (!panell1.isVisible()) {

				fadeIn1.playFromStart(); 
				panell1.setVisible(true);
				menupane.toBack();               //Once the button is clicked, the menu disappears and the designated menu displays
			}
		} else if (event.getSource() == menubutton2) {

			if (!panell2.isVisible()) {

				fadeIn2.playFromStart();
				panell2.setVisible(true);
				
				menupane.toBack();
			}
		} else if (event.getSource() == menubutton3) {

			if (!panell3.isVisible()) {

				fadeIn3.playFromStart();
				panell3.setVisible(true);
				
				menupane.toBack();
			}
		} else if (event.getSource() == menubutton4) {

			if (!panell4.isVisible()) {

				fadeIn4.playFromStart();
				panell4.setVisible(true);
			
				menupane.toBack();
			}
		}

	}

	// Fuzzy logic part 1

	public void Fuzzy(ActionEvent event) {

		// Load from 'FCL' file
		String fileName = "Fuzzylogic.fcl";
		FIS fis = FIS.load(fileName, true);
		if (fis == null) { // Error while loading?
			System.err.println("Can't load file: '" + fileName + "'");
			return;
		}

		// Show ruleset
		FunctionBlock functionBlock = fis.getFunctionBlock(null);
		JFuzzyChart.get().chart(functionBlock);

		// Set inputs
		String value1 = option1.getText();
		String value2 = option2.getText();
		String value3 = option3.getText();
		String value4 = option4.getText();
		String value5 = option5.getText();
		String value6 = option6.getText();

		functionBlock.setVariable("Sensitivity", Integer.parseInt(value1));
		functionBlock.setVariable("Frequency", Integer.parseInt(value2));
		functionBlock.setVariable("Freshness", Integer.parseInt(value3));
		functionBlock.setVariable("Time", Integer.parseInt(value4));
		functionBlock.setVariable("Volume", Integer.parseInt(value5));
		functionBlock.setVariable("Criticality", Integer.parseInt(value6));

		// Evaluate
		functionBlock.evaluate();

		// Show output variable's chart
		Variable Recommendation = functionBlock.getVariable("Recommendation");
		JFuzzyChart.get().chart(Recommendation, Recommendation.getDefuzzifier(), true);

		// Print ruleSet

		System.out.println("REC:" + functionBlock.getVariable("Recommendation").getValue()); //prints the value in the console

		int number = (int) Recommendation.getValue();
//once the value is shown in the console, this code evaluates the number and selects a recommendation based on that value into the text field
		if ((number == 1) || (number == 2) || (number == 3) || (number == 4) || (number == 5) || (number == 6)
				|| (number == 7) || (number == 8) || (number == 9) || (number == 10)) {
			box.setText("Thing To Fog to Cloud (T2F2C)");
		} else if ((number == 11) || (number == 12) || (number == 13) || (number == 14) || (number == 15)
				|| (number == 16) || (number == 17) || (number == 18) || (number == 19) || (number == 20)) {
			box.setText("Thing to Cloud (T2C)");
		} else if ((number == 21) || (number == 2) || (number == 23) || (number == 24) || (number == 25)
				|| (number == 26) || (number == 27) || (number == 28) || (number == 29) || (number == 30)) {
			box.setText("Thing to Fog (T2F)");
		} else if ((number == 31) || (number == 32) || (number == 33) || (number == 34) || (number == 35)
				|| (number == 36) || (number == 37) || (number == 38) || (number == 39) || (number == 40)) {
			box.setText("Thing to Cloud to Fog (T2C2F)");

		}

	}

	@FXML
	public void closeallwindows(ActionEvent event) { // closes all the fuzzy frames
		for (Frame closefuzzy : Frame.getFrames()) {
			if (closefuzzy.getTitle().matches("")) {
				closefuzzy.dispose();
			}
		}

	}

	// end of part 1
	//////////////////////////////////////////////////////////////////////////////////////

	// Part 2
	@FXML
	private void handleButtonAction(ActionEvent event) {

		final DirectoryChooser chooser = new DirectoryChooser(); //code for the file chooser component that allows the user to select a folder

		Stage stage = (Stage) panell2.getScene().getWindow();

		File file = chooser.showDialog(stage);

		if (file != null)
			;

		{
			System.out.println("Path : " + file.getAbsolutePath());
			path.setText(file.getAbsolutePath());
		}

	}

	@FXML
	private void clickme1(ActionEvent event) throws IOException {

		File file = new File(path.getText()); //gets the folder size in KBs
		long size = 0;
		size = getFileFolderSize(file);

		double sizeMB = (double) size / 1024 / 1024;
		String s = " MB";
		if (sizeMB < 1) {
			sizeMB = (double) size / 1024;
			s = " KB";

		}

		try (Stream<Path> files = Files.list(Paths.get(path.getText()))) { //gets the amount of contents within a folder
			long count = files.count();
			sizefield.setText(sizeMB + s);
			numbercount.setText("Number of files is:" + " " + count);

			File dir = new File(path.getText()); //gets the streaming file extension 
			File[] video = dir.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					return name.endsWith(".mp4") || name.endsWith(".avi") || name.endsWith(".flv")
							|| name.endsWith(".wmv") || name.endsWith(".mov") || name.endsWith(".avchd"); //some of the extensions that the program supports - using the most used

				}

			});

			File sensitive = new File(path.getText()); //detects if there is a sensitive file by reading the label such as "private" within one of the files in the folder
			File[] secret = sensitive.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					return name.startsWith("private");

				}

			});

			if ((count >= 4) && (sizeMB >= 100) && (video.length == 0) && (secret.length == 0)) { //list of code that allows the program decide which the result is using the criterons that were mentioned above
				streaming.setText("Streaming file NOT detected");
				sensitivefield.setText("Sensitive file NOT detected");
				result.setText("Cloud");
				option1.setText("0");
				option2.setText("10");
				option3.setText("0");
				option4.setText("5");
				option5.setText("10");
				option6.setText("0");
			} else if

			((count >= 4) && (sizeMB >= 100) && (video.length == 0) && (secret.length == 1)) {
				streaming.setText("Streaming file NOT detected");
				sensitivefield.setText("Sensitive file detected");
				result.setText("Fog to Cloud");
				option1.setText("10");
				option2.setText("10");
				option3.setText("0");
				option4.setText("5");
				option5.setText("10");
				option6.setText("0");

			} else if

			((count >= 4) && (sizeMB >= 100) && (video.length == 1) && (secret.length == 0)) {
				streaming.setText("Streaming file detected");
				sensitivefield.setText("Sensitive file NOT detected");
				result.setText("Fog to Cloud");
				option1.setText("0");
				option2.setText("0");
				option3.setText("0");
				option4.setText("5");
				option5.setText("10");
				option6.setText("0");

			} else if

			((count >= 4) && (sizeMB >= 100) && (video.length == 1) && (secret.length == 1)) {
				streaming.setText("Streaming file detected");
				sensitivefield.setText("Sensitive file detected");
				result.setText("Fog to Cloud");
				option1.setText("10");
				option2.setText("0");
				option3.setText("0");
				option4.setText("5");
				option5.setText("10");
				option6.setText("0");
			} else if

			((count >= 4) && (sizeMB <= 100) && (video.length == 0) && (secret.length == 0)) {
				streaming.setText("Streaming file NOT detected");
				sensitivefield.setText("Sensitive file NOT detected");
				result.setText("Cloud to Fog");
				option1.setText("0");
				option2.setText("10");
				option3.setText("0");
				option4.setText("5");
				option5.setText("0");
				option6.setText("0");

			} else if

			((count >= 4) && (sizeMB <= 100) && (video.length == 0) && (secret.length == 1)) {
				streaming.setText("Streaming file NOT detected");
				sensitivefield.setText("Sensitive file detected");
				result.setText("Fog");
				option1.setText("10");
				option2.setText("10");
				option3.setText("0");
				option4.setText("5");
				option5.setText("0");
				option6.setText("0");

			} else if

			((count >= 4) && (sizeMB <= 100) && (video.length == 1) && (secret.length == 0)) {
				streaming.setText("Streaming file detected");
				sensitivefield.setText("Sensitive file NOT detected");
				result.setText("Fog");
				option1.setText("0");
				option2.setText("0");
				option3.setText("0");
				option4.setText("5");
				option5.setText("0");
				option6.setText("0");
			} else if

			((count >= 4) && (sizeMB <= 100) && (video.length == 1) && (secret.length == 1)) {
				streaming.setText("Streaming file detected");
				sensitivefield.setText("Sensitive file detected");
				result.setText("Fog");
				option1.setText("10");
				option2.setText("0");
				option3.setText("0");
				option4.setText("5");
				option5.setText("0");
				option6.setText("0");

			} else if

			((count <= 4) && (sizeMB >= 100) && (video.length == 0) && (secret.length == 0)) {
				streaming.setText("Streaming file NOT detected");
				sensitivefield.setText("Sensitive file NOT detected");
				result.setText("Cloud");
				option1.setText("0");
				option2.setText("10");
				option3.setText("0");
				option4.setText("0");
				option5.setText("10");
				option6.setText("0");

			} else if

			((count <= 4) && (sizeMB >= 100) && (video.length == 0) && (secret.length == 1)) {
				streaming.setText("Streaming file NOT detected");
				sensitivefield.setText("Sensitive file detected");
				result.setText("Fog to Cloud");
				option1.setText("10");
				option2.setText("10");
				option3.setText("0");
				option4.setText("0");
				option5.setText("10");
				option6.setText("0");

			} else if

			((count <= 4) && (sizeMB >= 100) && (video.length == 1) && (secret.length == 0)) {
				streaming.setText("Streaming file detected");
				sensitivefield.setText("Sensitive file NOT detected");
				result.setText("Fog to Cloud");
				option1.setText("0");
				option2.setText("0");
				option3.setText("0");
				option4.setText("0");
				option5.setText("10");
				option6.setText("0");

			} else if

			((count <= 4) && (sizeMB >= 100) && (video.length == 1) && (secret.length == 1)) {
				streaming.setText("Streaming file detected");
				sensitivefield.setText("Sensitive file detected");
				result.setText("Fog to Cloud");
				option1.setText("10");
				option2.setText("0");
				option3.setText("0");
				option4.setText("0");
				option5.setText("10");
				option6.setText("0");

			} else if

			((count <= 4) && (sizeMB <= 100) && (video.length == 0) && (secret.length == 0)) {
				streaming.setText("Streaming file NOT detected");
				sensitivefield.setText("Sensitive file NOT detected");
				result.setText("Cloud to Fog");
				option1.setText("0");
				option2.setText("10");
				option3.setText("0");
				option4.setText("0");
				option5.setText("0");
				option6.setText("0");

				// connect tabs together show results
			} else if

			((count <= 4) && (sizeMB <= 100) && (video.length == 0) && (secret.length == 1)) {
				streaming.setText("Streaming file NOT detected");
				sensitivefield.setText("Sensitive file detected");
				result.setText("Fog");
				option1.setText("10");
				option2.setText("10");
				option3.setText("0");
				option4.setText("0");
				option5.setText("0");
				option6.setText("0");

			} else if

			((count <= 4) && (sizeMB <= 100) && (video.length == 1) && (secret.length == 0)) {
				streaming.setText("Streaming file detected");
				sensitivefield.setText("Sensitive file NOT detected");
				result.setText("Fog");
				option1.setText("0");
				option2.setText("0");
				option3.setText("0");
				option4.setText("0");
				option5.setText("0");
				option6.setText("0");

			} else if

			((count <= 4) && (sizeMB <= 100) && (video.length == 1) && (secret.length == 1)) {
				streaming.setText("Streaming file detected");
				sensitivefield.setText("Sensitive file detected");
				result.setText("Fog");
				option1.setText("10");
				option2.setText("0");
				option3.setText("0");
				option4.setText("0");
				option5.setText("0");
				option6.setText("0");

			}

		}
	}

	public static long getFileFolderSize(File dir) {
		long size = 0;
		if (dir.isDirectory()) {
			for (File file : dir.listFiles()) {
				if (file.isFile()) {
					size += file.length();
				} else
					size += getFileFolderSize(file);
			}
		} else if (dir.isFile()) {
			size += dir.length();
		}
		return size;
	}

	// end of part 2
	//////////////////////////////////////////////////////////////////////////////////////

	// Part 3

	@FXML
	public ComboBox<String> combobox; //code of the combo box that contains the list of cities below

	ObservableList<String> list = FXCollections.observableArrayList("Liverpool, UK", "London, UK", "Dublin, Ireland",
			"Paris, France", "Oslo, Norway", "Rome, Italy", "Warsaw, Poland", "Berlin, Germany", "Edinburgh, Scotland",
			"Abu Dhabi, United Arab Emirates", "Cairo, Egypt", "Algiers, Algeria", "Baghdad, Iraq", "Tehran, Iran",
			"Tripoli, Libya", "Benghazi, Libya", "Riyadh, Saudi Arabia", "Athens, Greece", "Istanbul, Turkey",
			"Gaziantep, Turkey", "Accra, Ghana");

	@FXML
	private void read1(ActionEvent event) { //reads the value that is currently set and makes the components visible
		off.setVisible(setVisible(false));
		on.setVisible(true);
		sensorimage.setVisible(true);

		location1.setText(combobox.getValue());

	}

	private boolean setVisible(boolean b) {
		// TODO Auto-generated method stub
		return false;
	}

	@FXML
	private void showresults(ActionEvent event) { //shows the duties that are detected then depending on the duties that have been selected, it shows the appropriate transactional property

		if (location1.getText().isEmpty() && (output.getText().isEmpty() && (degrees.getText().isEmpty()))) {

			showresults.setText("Select an Option");
		}

		else if (degrees.getText().isEmpty() && (output.getText().isEmpty())) {
			showresults.setText(
					"                     Duties Detected \n                                S \n\n     Appropriate Transactional Measure:\n                          Retriable ");
		} else if (location1.getText().isEmpty() && (output.getText().isEmpty())) {

			showresults.setText(
					"                     Duties Detected \n                                A \n\n     Appropriate Transactional Measure:\n              Retriable / Compensatable  ");
		}

		else if (location1.getText().isEmpty() && (degrees.getText().isEmpty())) {

			showresults.setText(
					"                     Duties Detected \n                                C \n\n     Appropriate Transactional Measure:\n                          Retriable ");
		}

		else if (output.getText().isEmpty()) {

			showresults.setText(
					"                    Duties Detected \n                               S.A \n\n     Appropriate Transactional Measure:\n             Strong Pivot / Retriable ");

		} else if (location1.getText().isEmpty()) {

			showresults.setText(
					"                    Duties Detected \n                               A.C \n\n     Appropriate Transactional Measure:\n             Strong Pivot / Retriable ");

		}

		else if (emptypurpose.getText().isEmpty()) {

			showresults.setText(
					"                     Duties Detected \n                              S.A.C \n\n     Appropriate Transactional Measure:\n                         Retriable ");

		}

	}

	@FXML
	private void gettemp(ActionEvent event) {

		off1.setVisible(setVisible(false));
		on1.setVisible(true);
		actuatingimage.setVisible(true);
//below shows the URL of the server where the multi-criteria program reads the weather data. Requires an internet connection.
		String API_KEY = "978d354eca2e47f7a96f05006859c3d1";
		String LOCATION = location1.getText();
		String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + LOCATION + "&appid=" + API_KEY
				+ "&units=metric";

		try {
			StringBuilder result = new StringBuilder();
			URL url = new URL(urlString);
			URLConnection conn = url.openConnection();
			BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
			rd.close();

			Map<String, Object> respMap = jsonToMap(result.toString());
			Map<String, Object> mainMap = jsonToMap(respMap.get("main").toString());

			degrees.setText("" + mainMap.get("temp")); //gets the temperature of the city

			double d = Double.parseDouble(degrees.getText());
			int i = (int) d;
			degrees.setText("" + i);

		} catch (IOException e) {
			System.out.println(e.getMessage());

		}

	}

	public static Map<String, Object> jsonToMap(String str) {
		Map<String, Object> map = new Gson().fromJson(str, new TypeToken<HashMap<String, Object>>() {
		}.getType());
		return map;
	}

	@FXML
	private void testing(ActionEvent event) {

		off2.setVisible(setVisible(false));
		on2.setVisible(true);
		communicateimage.setVisible(true);
//depending on the temperature of the city, a recommendation appears with what they should wear
		int equal = (int) Integer.parseInt(degrees.getText());

		if ((equal == -7) || (equal == -6) || (equal == -5) || (equal == -4) || (equal == -3)) {
			output.setText("Winter jacket");
		} else if ((equal == -2) || (equal == -1) || (equal == 0) || (equal == 1) || (equal == 2) || (equal == 3)
				|| (equal == 4) || (equal == 5) || (equal == 6) || (equal == 7)) {
			output.setText("Light to Medium Coat");
		} else if ((equal == 8) || (equal == 9) || (equal == 10) || (equal == 11) || (equal == 12) || (equal == 13)
				|| (equal == 14) || (equal == 15) || (equal == 16) || (equal == 17)) {
			output.setText("Fleece");
		} else if ((equal == 18) || (equal == 19) || (equal == 20) || (equal == 21) || (equal == 22) || (equal == 23)
				|| (equal == 24) || (equal == 25) || (equal == 26)) {
			output.setText("Short Sleeves");
		} else if ((equal >= 27)) {
			output.setText("Shorts");

		}

	}

	@FXML
	private void Clear(ActionEvent event) {
                                                  //clears the contents that have been inputed.
		on.setVisible(setVisible(false));
		off.setVisible(!on.isVisible());
		on1.setVisible(setVisible(false));
		off1.setVisible(!on1.isVisible());
		on2.setVisible(setVisible(false));
		off2.setVisible(!on2.isVisible());
		communicateimage.setVisible(setVisible(false));
		sensorimage.setVisible(setVisible(false));
		actuatingimage.setVisible(setVisible(false));

		location1.setText("");
		degrees.setText("");
		output.setText("");
		showresults.setText("");
	}

	// end of part 3
	//////////////////////////////////////////////////////////////////////////////////////

	// Start part 4

	public void RadioSelect(ActionEvent event) {
//radio buttons for grouping 
		ToggleGroup toggleGroup = new ToggleGroup();
		WeakPivot.setToggleGroup(toggleGroup);
		StrongPivot.setToggleGroup(toggleGroup);
		radiooff.setToggleGroup(toggleGroup);

	}

	public void ppmradio(ActionEvent event) {

		ToggleGroup toggleGroup1 = new ToggleGroup();
		radioconcern.setToggleGroup(toggleGroup1);
		radiodanger.setToggleGroup(toggleGroup1);
		radiooff1.setToggleGroup(toggleGroup1);

	}

	@FXML
	private void BackupSensor(ActionEvent event) {
//depending on the measure of the JSlider, components become visible or they don't
		if (co2.getText().equals("0") || (co2.getText().equals("250")) || (co2.getText().equals("500"))
				|| (co2.getText().equals("1,000"))) {
			lblmid.setVisible(setVisible(false));
			lblfast.setVisible(setVisible(false));
			lbllightstop.setVisible(setVisible(false));
			lbllightstop2.setVisible(setVisible(false));
			lbltraffic.setVisible(setVisible(false));
			concern1.setVisible(setVisible(false));
			concern2.setVisible(setVisible(false));
			danger1.setVisible(setVisible(false));
			danger2.setVisible(setVisible(false));
			danger3.setVisible(setVisible(false));
			danger4.setVisible(setVisible(false));
			lblslow.setVisible(true);
			lbllight.setVisible(true);
			lbllight2.setVisible(true);
			safe1.setVisible(true);
			safe2.setVisible(true);

		}

		if (co2.getText().equals("1,250") || (co2.getText().equals("1,500")) || (co2.getText().equals("1,750"))
				|| (co2.getText().equals("2,000"))) {
			lblslow.setVisible(setVisible(false));
			lbltraffic.setVisible(setVisible(false));
			lblfast.setVisible(setVisible(false));
			safe1.setVisible(setVisible(false));
			safe2.setVisible(setVisible(false));
			danger1.setVisible(setVisible(false));
			danger2.setVisible(setVisible(false));
			danger3.setVisible(setVisible(false));
			danger4.setVisible(setVisible(false));
			lblmid.setVisible(true);
			concern1.setVisible(true);
			concern2.setVisible(true);

		}
		if (co2.getText().equals("2,250")
				|| (co2.getText().equals("2,500") || (co2.getText().equals("2,750")) || (co2.getText().equals("3,000"))
						|| (co2.getText().equals("3,250") || (co2.getText().equals("3,500")
								|| (co2.getText().equals("3,750")) || (co2.getText().equals("4,000"))
								|| (co2.getText().equals("4,250") || (co2.getText().equals("4,500")
										|| (co2.getText().equals("4,750")) || (co2.getText().equals("5,000")))))))) {
			lbllight.setVisible(setVisible(false));
			lbllight2.setVisible(setVisible(false));
			lblslow.setVisible(setVisible(false));
			lblmid.setVisible(setVisible(false));
			concern1.setVisible(setVisible(false));
			concern2.setVisible(setVisible(false));
			safe1.setVisible(setVisible(false));
			safe2.setVisible(setVisible(false));
			lblfast.setVisible(setVisible(false));
			lblfast.setVisible(true);
			lbllightstop.setVisible(true);
			lbllightstop2.setVisible(true);
			lbltraffic.setVisible(true);
			danger1.setVisible(true);
			danger2.setVisible(true);
			danger3.setVisible(true);
			danger4.setVisible(true);

		}

	}

	private boolean cancelled = true;
//allows the program to run the thread which activates the action in which the JSlider moves automatically by setting the number in the text field that is connected to the slider
	@FXML
	public void hideconcern(ActionEvent event) {

		if (cancelled) {

			new Thread(() -> {
				if (cancelled) {
					Platform.runLater(() -> co2.setText("0"));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("250"));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("500"));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("750"));
					try {
						Thread.sleep(1500);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("1,000"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("1,250"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("1,500"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("1,750"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("2,000"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("2,000"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("1,750"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("1,750"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("1,500"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("1,500"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("1,250"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("1,250"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("1,000"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("750"));
					lblfast1.setVisible(false);
					lblslow1.setVisible(true);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("500"));
					lblfast1.setVisible(false);
					lblslow1.setVisible(true);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("250"));
					lblfast1.setVisible(false);
					lblslow1.setVisible(true);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("0"));
					lblfast1.setVisible(false);
					lblslow1.setVisible(true);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}

			}).start(); //begins the process
			return;
		}
	}

	@FXML
	private void stopprocess1(ActionEvent event) {
//stops the thread process
		cancelled = false;
		co2.setText("0");
		lblslow1.setVisible(true);

		lblfast1.setVisible(false);

		errorfan1.setVisible(false);
		fanmsg.setVisible(false);
		WeakPivot.setSelected(false);
		StrongPivot.setSelected(false);
		radioconcern.setSelected(false);
		radiodanger.setSelected(false);
		sensoron2.setVisible(false);

	}

	@FXML
	private void hidedanger(ActionEvent event) {

		if (cancelled) {
			new Thread(() -> {

				Platform.runLater(() -> co2.setText("0"));
				try {
					Thread.sleep(2000);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}

				if (cancelled) {
					Platform.runLater(() -> co2.setText("250"));
					try {
						Thread.sleep(500);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("500"));
					try {
						Thread.sleep(500);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("750"));
					try {
						Thread.sleep(500);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("1,000"));
					try {
						Thread.sleep(500);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("1,250"));
					try {
						Thread.sleep(500);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("1,500"));
					try {
						Thread.sleep(500);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("1,750"));
					try {
						Thread.sleep(500);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("2,000"));
					try {
						Thread.sleep(750);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("2,250"));
					try {
						Thread.sleep(750);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("2,500"));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("2,750"));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("3,000"));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("3,250"));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("3,500"));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("3,750"));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("4,000"));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("4,250"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("4,500"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("4,500"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("4,500"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("4,500"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("4,250"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("4,250"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("4,000"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("3,750"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("3,500"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("3,500"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("3,250"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("3,000"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("2,750"));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("2,500"));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("2,250"));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("2,000"));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("1,750"));
					try {
						Thread.sleep(500);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("1,500"));
					try {
						Thread.sleep(500);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("1,250"));
					try {
						Thread.sleep(500);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("1,000"));
					try {
						Thread.sleep(500);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("750"));
					lblfast1.setVisible(false);
					lblslow1.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("500"));
					lblfast1.setVisible(false);
					lblslow1.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("250"));
					lblfast1.setVisible(false);
					lblslow1.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				if (cancelled) {
					Platform.runLater(() -> co2.setText("0"));
					lblfast1.setVisible(false);
					lblslow1.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException ex) {
						ex.printStackTrace();

					}
				}

			}).start();
			return;
		}
	}

	Timer timer1 = new Timer();
	TimerTask myTask = new TimerTask() {
		@Override
		public void run() {
			BackupSensor(null);
		}
	};

	Timer timer2 = new Timer();
	TimerTask myTask2 = new TimerTask() {
		@Override
		public void run() {
			BackupSensor(null);
		}
	};

	@FXML
	private void radiobutton(ActionEvent event) {
		cancelled = true;
		sensoron2.setVisible(true);

		{

			errorfan1.setVisible(false);

			if (WeakPivot.isSelected()) {
//randomizes the Strong or Weak pivot by 50% to give the resemblance of a real life sensor breaking
				Random rn = new Random();

				for (int i = 0; i < 100; i++) {
					int answer = rn.nextInt(2) + 1;
					randomhide.setText("" + answer);
				}

				int random1 = (int) Integer.parseInt(randomhide.getText());

				if ((random1 == 1)) {
//dialog box appears of an error 
					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("Error Dialog");
					alert.setHeaderText("Main Sensor: Failed");
					alert.setContentText("System Failed: Calling Next Fan");
					alert.showAndWait();
					lblslow1.setVisible(false);

					lblfast1.setVisible(true);

					fanmsg.setVisible(true);

					lblslow.setVisible(true);
					errorfan1.setVisible(true);

					if (radioconcern.isSelected()) {
						hideconcern(event);
						timer1.schedule(myTask, 1000, 1000);

					}

					else if (radiodanger.isSelected()) {
						hidedanger(event);
						timer2.schedule(myTask2, 1000, 1000);

					}

				}

			}

			if (StrongPivot.isSelected()) {

				Random rn = new Random();

				for (int i = 0; i < 100; i++) {
					int answer = rn.nextInt(2) + 1;
					randomhide.setText("" + answer);
				}

				int random1 = (int) Integer.parseInt(randomhide.getText());

				if ((random1 == 1)) {
					cancelled = false;

					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("Error Dialog");
					alert.setHeaderText("Main Sensor: Failed");
					alert.setContentText("Call Engineer");
					alert.showAndWait();

					if (cancelled) {
						new Thread(() -> {

							Platform.runLater(() -> co2.setText("0"));
							try {
								Thread.sleep(2000);
							} catch (InterruptedException ex) {
								ex.printStackTrace();
							}

							if (cancelled) {
								Platform.runLater(() -> co2.setText("0"));
								try {
									Thread.sleep(500);
								} catch (InterruptedException ex) {
									ex.printStackTrace();
								}
							}

						}).start();
						return;
					}
				}
			}
		}

		if (radioconcern.isSelected()) {
			hideconcern(event);
			timer1.schedule(myTask, 1000, 1000);

		}

		if (radiodanger.isSelected()) {
			hidedanger(event);
			timer2.schedule(myTask2, 1000, 1000);

		}

	}

	// end of part 4

	@FXML
	private void backtomenu1(ActionEvent event) {

		menupane.toFront();
		panell1.setVisible(false);

	}

	@FXML
	private void backtomenu2(ActionEvent event) {

		menupane.toFront();
		panell2.setVisible(false);

	}

	@FXML
	private void backtomenu3(ActionEvent event) {

		menupane.toFront();
		panell3.setVisible(false);

	}

	@FXML
	private void backtomenu4(ActionEvent event) {

		menupane.toFront();
		panell4.setVisible(false);

	}

	@FXML
	public void white(ActionEvent event) {
		Stage menuStage = new Stage();
		Main c = new Main();
		c.start(menuStage);
		menuStage.show();

		Stage stage = (Stage) closewindowbutton.getScene().getWindow();
		stage.close();

	}
//launches the help menu
	@FXML
	public void help(ActionEvent event) {

		Stage menuStage3 = new Stage();
		Help1 p = new Help1();
		p.start(menuStage3);
		menuStage3.show();

	}
//exits the program completely 
	@FXML
	public void exitprogram(ActionEvent event) {

		System.exit(0);
	}

}
