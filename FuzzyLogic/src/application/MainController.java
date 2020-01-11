package application;




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

import Darkmode.Menu;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;


public class MainController implements Initializable {
	
	
	


	@FXML
	Label sensorimage, actuatingimage, communicateimage;
	@FXML
	AnchorPane pane;
	
	@FXML
	Label sen, examplelabel;
	
	@FXML
	Label sen1;
	
	@FXML
	Button exit;

   @FXML
    TextField box, randomhide;
	
	@FXML
	 TextField option1;
	
	@FXML
	 TextField option2;
	
	@FXML
	 TextField option3;
	 
	 @FXML
	 TextField option4;
	 
	 @FXML
	 TextField option5;
	 
	 @FXML
	 TextField option6;
	
	@FXML
	Slider slider1;
	
	@FXML
	
	Slider slider2;
	
    @FXML
	
	Slider slider3;
    
    @FXML
    
    Slider slider4;
    
    @FXML
    
    Slider slider5;
    
    @FXML
    
    Slider slider6;
    
    @FXML
    
    Slider slider7;
    
    @FXML
    TextField path;
    
    @FXML 
    Button Window1, Window2, Window3, Window4, clickme, WindowW;
    
    @FXML
    Label pointer;
    
    @FXML
    Label on, on1, on2;
    
    
    @FXML
    TextField location;
    
    @FXML
    TextField degrees, co2;

    
    @FXML
    TextField output;
    
    @FXML
    Label lbloff, lblslow, lblmid, lblfast, lbllightstop, lbllightstop2, lbllight, lbllight2, lbltraffic, sensoron, sensoroff, concern1, concern2, safe1, safe2,
    danger1, danger2, danger3, danger4, sensoron2;
    
    @FXML
    Button sensegas, returnbutton;
 
    @FXML
    TextField test321;
    
    @FXML
    RadioButton WeakPivot, StrongPivot, radioconcern, radiodanger, radiooff, radiooff1;
    
    
@FXML
Label off, off1, off2;

@FXML
TextArea showresults;









@FXML
private void MainSensor(ActionEvent event) {
	
	

	Random rn = new Random();

	for(int i =0; i < 100; i++)
	{
	    int answer = rn.nextInt(2) + 1;
	    randomhide.setText("" + answer);
	}

int random1 = (int ) Integer.parseInt(randomhide.getText());
	
	if((random1 == 1)){
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Error Dialog");
		alert.setHeaderText("Main Sensor: Failed");
		alert.setContentText("Switching to Backup Sensor");
		alert.showAndWait();
		
		sensoroff.setVisible(true);

		
		co2.setText("0");
		
		
		sensegas.setDisable(true);
		
		if  (co2.getText().equals("0") || (co2.getText().equals("250")) || (co2.getText().equals("500")) || (co2.getText().equals("750")) || (co2.getText().equals("1,000"))) {
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
		
		if   
			(co2.getText().equals("1,250") || (co2.getText().equals("1,500")) || 
		    (co2.getText().equals("1,750")) || (co2.getText().equals("2,000")))  {
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
		if (co2.getText().equals("2,250") || (co2.getText().equals("2,500") || (co2.getText().equals("2,750")) || (co2.getText().equals("3,000")) || 
			(co2.getText().equals("3,250") || (co2.getText().equals("3,500") || (co2.getText().equals("3,750")) || (co2.getText().equals("4,000")) ||
			(co2.getText().equals("4,250") || (co2.getText().equals("4,500") || (co2.getText().equals("4,750")) || (co2.getText().equals("5,000")))))))) {
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
	
	
	
	sensoron.setVisible(true);

	
	
	
	
}














	
	
	
	
	 


public void RadioSelect(ActionEvent event) {

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
	


	sensoron2.setVisible(true);
	
	
	
	if  (co2.getText().equals("0") || (co2.getText().equals("250")) || (co2.getText().equals("500")) || (co2.getText().equals("1,000"))) {
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
	
	if   
		(co2.getText().equals("1,250") || (co2.getText().equals("1,500")) || 
	    (co2.getText().equals("1,750")) || (co2.getText().equals("2,000")))  {
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
	if (co2.getText().equals("2,250") || (co2.getText().equals("2,500") || (co2.getText().equals("2,750")) || (co2.getText().equals("3,000")) || 
		(co2.getText().equals("3,250") || (co2.getText().equals("3,500") || (co2.getText().equals("3,750")) || (co2.getText().equals("4,000")) ||
		(co2.getText().equals("4,250") || (co2.getText().equals("4,500") || (co2.getText().equals("4,750")) || (co2.getText().equals("5,000")))))))) {
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


@FXML
private void hideconcern(ActionEvent event) {
	

	
	new Thread(()->{ 
	      
        Platform.runLater(() -> co2.setText("0"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("250"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("500"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("750"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("1,000"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("1,250"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("1,500"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("1,750"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("2,000"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("2,000"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("1,750"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("1,750"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("1,500"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("1,500"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("1,250"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("1,250"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("1,000"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("750"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("500"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("250"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("0"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}

       
	      
}).start();
	
}

@FXML
private void hidedanger(ActionEvent event) {
	
	
	
	new Thread(()->{ 
	      
        Platform.runLater(() -> co2.setText("0"));
        try 
        {Thread.sleep(2000);} 
        catch (InterruptedException ex) { ex.printStackTrace();}
        
        
        
        
        Platform.runLater(() -> co2.setText("250"));
        try {Thread.sleep(500);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("500"));
        try {Thread.sleep(500);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("750"));
        try {Thread.sleep(500);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("1,000"));
        try {Thread.sleep(500);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("1,250"));
        try {Thread.sleep(500);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("1,500"));
        try {Thread.sleep(500);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("1,750"));
        try {Thread.sleep(500);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("2,000"));
        try {Thread.sleep(750);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("2,250"));
        try {Thread.sleep(750);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("2,500"));
        try {Thread.sleep(1000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("2,750"));
        try {Thread.sleep(1000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("3,000"));
        try {Thread.sleep(1000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("3,250"));
        try {Thread.sleep(1000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("3,500"));
        try {Thread.sleep(1000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("3,750"));
        try {Thread.sleep(1000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("4,000"));
        try {Thread.sleep(1000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("4,250"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("4,500"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("4,500"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("4,500"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("4,500"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("4,250"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("4,250"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("4,000"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("3,750"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("3,500"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("3,500"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("3,250"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("3,000"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("2,750"));
        try {Thread.sleep(2000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("2,500"));
        try {Thread.sleep(1000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("2,250"));
        try {Thread.sleep(1000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("2,000"));
        try {Thread.sleep(1000);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("1,750"));
        try {Thread.sleep(500);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("1,500"));
        try {Thread.sleep(500);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("1,250"));
        try {Thread.sleep(500);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("1,000"));
        try {Thread.sleep(500);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("750"));
        try {Thread.sleep(500);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("500"));
        try {Thread.sleep(500);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("250"));
        try {Thread.sleep(500);} catch (InterruptedException ex) { ex.printStackTrace();}
        Platform.runLater(() -> co2.setText("0"));
        try {Thread.sleep(500);} catch (InterruptedException ex) { ex.printStackTrace();}

    	
	
	}).start();
	
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
	{
	if (WeakPivot.isSelected()) {
		
		Random rn = new Random();

		for(int i =0; i < 100; i++)
		{
		    int answer = rn.nextInt(2) + 1;
		    randomhide.setText("" + answer);
		}

	int random1 = (int ) Integer.parseInt(randomhide.getText());
		
		if((random1 == 1)){
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error Dialog");
			alert.setHeaderText("Main Sensor: Failed");
			alert.setContentText("System Failed");
			alert.showAndWait();
			radiooff1.setSelected(true);
			radiooff.setSelected(true);
			
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


@FXML
private void stopprocess1(ActionEvent event) {
	
	radiooff1.setSelected(true);
	radiooff.setSelected(true);
	timer1.cancel();
    myTask.cancel();
	timer2.cancel();
	myTask2.cancel();
	timer1.purge();
	timer2.purge();
	co2.setText("0");

}













































    @FXML
    public ComboBox<String> combobox;
    
    ObservableList<String> list = FXCollections.observableArrayList("Liverpool, UK", "London, UK", "Dublin, Ireland", "Paris, France", "Oslo, Norway", "Rome, Italy", "Warsaw, Poland", "Berlin, Germany", "Budapest, Hungary", "Edinburgh, Scotland", "Abu Dhabi, United Arab Emirates", "Cairo, Egypt", "Algiers, Algeria", "Baghdad, Iraq", "Tehran, Iran", "Tripoli, Libya", "Benghazi, Libya", "Riyadh, Saudi Arabia", "Athens, Greece");

    	
    @FXML
    private void read1(ActionEvent event) {
    	off.setVisible(setVisible(false));
    	on.setVisible(true);
    	sensorimage.setVisible(true);
    	
    	location.setText(combobox.getValue());
    	
    }
    
    @FXML
    private void showresults(ActionEvent event) {
    	
    	if  (location.getText().isEmpty() && (output.getText().isEmpty() && (degrees.getText().isEmpty()))) {
	 	    	 
	 	    showresults.setText("Select an Option");
	    	}
    	
    	
    	else if(degrees.getText().isEmpty() && (output.getText().isEmpty())){
    		showresults.setText("                     Duties Detected \n                                S \n\n     Appropriate Transactional Measure:\n                          Retriable ");
 	     }
 	     else if (location.getText().isEmpty() && (output.getText().isEmpty())) {
 	    	 
 	    	showresults.setText("                     Duties Detected \n                                A \n\n     Appropriate Transactional Measure:\n              Retrievable / Compensatable  ");
 	     }
 	    	
 	    	else if (location.getText().isEmpty() && (degrees.getText().isEmpty())) {
 	 	    	 
 	 	    showresults.setText("                     Duties Detected \n                                C \n\n     Appropriate Transactional Measure:\n                          Retrievable ");
 	    	}
 	 	    	
 	 	    	else if (output.getText().isEmpty()) {
 	 	 	    	 
 	 	    showresults.setText("                     Duties Detected \n                               S.A \n\n     Appropriate Transactional Measure:\n             Strong Pivot / Retrievable ");
 	 	    		
 	 	    	}
 	 	    		else if (location.getText().isEmpty()) {
 	 	 	 	    	 
 	 	 	showresults.setText("                     Duties Detected \n                               A.C \n\n     Appropriate Transactional Measure:\n             Strong Pivot / Retrievable ");
 	      
 	    }

    	
 	 	    		else if (result.getText().isEmpty()) {
	 	 	 	    	 
 	 	 	showresults.setText("                     Duties Detected \n                              S.A.C \n\n     Appropriate Transactional Measure:\n                         Retrievable ");
 	      
 	    }
    	
 	 	    		
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	//if (location.getText().isEmpty() || (degrees.getText().isEmpty() || (output.getText().isEmpty()))){
    	  //     showresults.setText("Select At least One Option");
    	   //  }
    	    // else  {
    	    //   showresults.setText("                     Duties Detected \n                              S.A.C \n\n     Appropriate Transactional Measure:\n                           Retriable ");
    	   // }
    	
    	
    }
    

    
    @FXML
	private void gettemp(ActionEvent event) {
 
    	off1.setVisible(setVisible(false));
    	on1.setVisible(true);
    	actuatingimage.setVisible(true);
    
    	
    	String API_KEY = "978d354eca2e47f7a96f05006859c3d1";
		String LOCATION = location.getText();
		String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + LOCATION + "&appid=" + API_KEY + "&units=metric";


		
		try {
			StringBuilder result = new StringBuilder();
			URL url = new URL (urlString);
			URLConnection conn = url.openConnection();
			BufferedReader rd= new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = rd.readLine()) !=null) {
				result .append(line);
			}
			rd.close();
			
			
			Map<String, Object> respMap = jsonToMap(result.toString());
			Map<String, Object> mainMap = jsonToMap(respMap.get("main").toString());

			

		degrees.setText(""+mainMap.get("temp"));
			
    	double d = Double.parseDouble(degrees.getText());
    	int i = (int)d;
    	degrees.setText("" + i);
			
				
			

			
		}catch (IOException e) {
			System.out.println(e.getMessage());
			
			
    
    }
		
		

    
    }
    

    

    
    @FXML
	private void testing(ActionEvent event) {
    	
    	off2.setVisible(setVisible(false));
    	on2.setVisible(true);
    	communicateimage.setVisible(true);

    
    	int equal = (int ) Integer.parseInt(degrees.getText());
    	
        if ((equal == -7) || (equal == -6) || (equal == -5) || (equal == -4) || (equal == -3)) {
	           output.setText("Winter jacket");
	        }
	        else if ((equal == -2) || (equal == -1) || (equal == 0) || (equal == 1) || (equal == 2) || (equal == 3) || (equal == 4) || (equal == 5) || (equal == 6) || (equal == 7)) {
	        	output.setText("Light to Medium Coat");
	        }
	        else if ((equal == 8) || (equal == 9) || (equal == 10) || (equal == 11) || (equal == 12) || (equal == 13) || (equal == 14) || (equal == 15) || (equal == 16) || (equal == 17)) {
	        	output.setText("Fleece");
	        }
	        else if ((equal == 18) || (equal == 19) || (equal == 20) || (equal == 21) || (equal == 22) || (equal == 23) || (equal == 24) || (equal == 25) || (equal == 26)) {
	        	output.setText("Short Sleeves");
	        }    
	        else if ((equal >= 27)) {
		        output.setText("Shorts");
		    
		        }
    	
	        
    
    }
    
    
 
    
    	
    
    
    
    
    
    
    
    

    
    @FXML 
    private AnchorPane panel1, panel2, panel3, panel4, panelW;
    

	private static final double INIT_VALUE = 5;
	private static final double INIT_VALUE1 = 0;
	
	@FXML
	TextField sizefield, numbercount, streaming, sensitivefield, result;


	
	
	
	
	
	
	@FXML
	private void openwindow(ActionEvent event) {
		
		examplelabel.setVisible(setVisible(false)); 
		 on.setVisible(setVisible(false));
	    	off.setVisible(!on.isVisible());
			 on1.setVisible(setVisible(false));
		    	off1.setVisible(!on1.isVisible());
				 on2.setVisible(setVisible(false));
			    	off2.setVisible(!on2.isVisible());
			    	communicateimage.setVisible(setVisible(false));
			    	sensorimage.setVisible(setVisible(false));
			    	actuatingimage.setVisible(setVisible(false));
		
					 location.setText("");
					 degrees.setText("");
					 output.setText("");
					 showresults.setText("");
					 
					 
		if(event.getSource() == Window1) 
		{
			
			panel1.toFront();
		}
		else
		if(event.getSource() == Window2) 
		{
				
			panel2.toFront();
		}
		else
			if(event.getSource() == Window3) 
			{
					
				panel3.toFront();	
			}
		else
			if(event.getSource() == Window4) 
			{
				
				panel4.toFront();
			}
			
			else
				if(event.getSource() == WindowW) 
				{
					
					panelW.toFront();
				}
	
		
	}
	
	
	
	private boolean setVisible(boolean b) {
		// TODO Auto-generated method stub
		return false;
	}



	@FXML
	private void handleButtonAction(ActionEvent event) {
		
		
		
		final DirectoryChooser chooser = new DirectoryChooser();
		
		Stage stage = (Stage) pane.getScene().getWindow();
		
		File file = chooser.showDialog(stage);
		
		if (file !=null);
		
		{
			System.out.println("Path : " +file.getAbsolutePath());
			path.setText(file.getAbsolutePath());
		}
		
	}
	
	
	
	@FXML
	private void clickme1(ActionEvent event) throws IOException  {
		

		
		examplelabel.setVisible(!examplelabel.isVisible());



		
        File file = new File(path.getText());
		long size = 0;
		size = getFileFolderSize(file);
 
		double sizeMB = (double) size / 1024 / 1024;
		String s = " MB";
		if (sizeMB < 1) {
			sizeMB = (double) size / 1024;
			s = " KB";
			
		}

		
		try (Stream<Path> files = Files.list(Paths.get(path.getText()))){
		    long count = files.count();
		    sizefield.setText(file.getName() + " : " + sizeMB + s);
		    numbercount.setText("Number of files is:" + " " + count);
		    
		    
		    File dir = new File(path.getText());                         // LOOK AT RULE SET 
			File [] video = dir.listFiles(new FilenameFilter() {
			    @Override
			    public boolean accept(File dir, String name) {
			        return name.endsWith(".mp4");
			     
			        
			    }
			    
			});
			
		    File sensitive = new File(path.getText());                         // LOOK AT RULE SET 
			File [] secret = sensitive.listFiles(new FilenameFilter() {
			    @Override
			    public boolean accept(File dir, String name) {
			        return name.startsWith("private");
			        
			     
			        
			    }
			    
			});
	        
		


			 if ((count >= 4) && (sizeMB >= 100) && (video.length == 0) && (secret.length == 0)) {
			    	streaming.setText("Streaming file NOT detected");
			    	sensitivefield.setText("Sensitive file NOT detected");
		    	result.setText("Cloud");
		    	option1.setText("0"); option2.setText("10"); option3.setText("0"); option4.setText("5"); option5.setText("10"); option6.setText("0");
		    }else if
		   			    
			 ((count >= 4) && (sizeMB >= 100) && (video.length == 0) && (secret.length == 1)) {
		    	streaming.setText("Streaming file NOT detected");
		    	sensitivefield.setText("Sensitive file detected");
		    	result.setText("Fog to Cloud");
		    	option1.setText("10"); option2.setText("10"); option3.setText("0"); option4.setText("5"); option5.setText("10"); option6.setText("0");

		    }else if
			    
			 ((count >= 4) && (sizeMB >= 100) && (video.length == 1) && (secret.length == 0)) {
		    	streaming.setText("Streaming file detected");
		    	sensitivefield.setText("Sensitive file NOT detected");
		    	result.setText("Fog to Cloud");
		    	option1.setText("0"); option2.setText("0"); option3.setText("0"); option4.setText("5"); option5.setText("10"); option6.setText("0");


		    	
		    }else if
			    
			 ((count >= 4) && (sizeMB >= 100) && (video.length == 1) && (secret.length == 1)) {
		    	streaming.setText("Streaming file detected");
		    	sensitivefield.setText("Sensitive file detected");
		    	result.setText("Fog to Cloud");
		    	option1.setText("10"); option2.setText("0"); option3.setText("0"); option4.setText("5"); option5.setText("10"); option6.setText("0");
		    }else if
			    
			 ((count >= 4) && (sizeMB <= 100) && (video.length == 0) && (secret.length == 0)) {
		    	streaming.setText("Streaming file NOT detected");
		    	sensitivefield.setText("Sensitive file NOT detected");
		    	result.setText("Cloud to Fog");  
		    	option1.setText("0"); option2.setText("10"); option3.setText("0"); option4.setText("5"); option5.setText("0"); option6.setText("0");
		    	
				
		    }else if
			    
			 ((count >= 4) && (sizeMB <= 100) && (video.length == 0) && (secret.length == 1)) {
		    	streaming.setText("Streaming file NOT detected");
		    	sensitivefield.setText("Sensitive file detected");
		    	result.setText("Fog");
		    	option1.setText("10"); option2.setText("10"); option3.setText("0"); option4.setText("5"); option5.setText("0"); option6.setText("0");
		    	
		    }else if
			    
			 ((count >= 4) && (sizeMB <= 100) && (video.length == 1) && (secret.length == 0)) {
		    	streaming.setText("Streaming file detected");
		    	sensitivefield.setText("Sensitive file NOT detected");
		    	result.setText("Fog");	
		    	option1.setText("0"); option2.setText("0"); option3.setText("0"); option4.setText("5"); option5.setText("0"); option6.setText("0");
		    }else if
			    
			 ((count >= 4) && (sizeMB <= 100) && (video.length == 1) && (secret.length == 1)) {
		    	streaming.setText("Streaming file detected");
		    	sensitivefield.setText("Sensitive file detected");
		    	result.setText("Fog");
		    	option1.setText("10"); option2.setText("0"); option3.setText("0"); option4.setText("5"); option5.setText("0"); option6.setText("0");
		    	
		    }else if
			    
			 ((count <= 4) && (sizeMB >= 100) && (video.length == 0) && (secret.length == 0)) {
		    	streaming.setText("Streaming file NOT detected");
		    	sensitivefield.setText("Sensitive file NOT detected");
		    	result.setText("Cloud");	
		    	option1.setText("0"); option2.setText("10"); option3.setText("0"); option4.setText("0"); option5.setText("10"); option6.setText("0");
		    	
		    	
		    	
		    }else if
			    
			 ((count <= 4) && (sizeMB >= 100) && (video.length == 0) && (secret.length == 1)) {
		    	streaming.setText("Streaming file NOT detected");
		    	sensitivefield.setText("Sensitive file detected");
		    	result.setText("Fog to Cloud");	
		    	option1.setText("10"); option2.setText("10"); option3.setText("0"); option4.setText("0"); option5.setText("10"); option6.setText("0");
		    	
		    }else if
			    
			 ((count <= 4) && (sizeMB >= 100) && (video.length == 1) && (secret.length == 0)) {
		    	streaming.setText("Streaming file detected");
		    	sensitivefield.setText("Sensitive file NOT detected");
		    	result.setText("Fog to Cloud");
		    	option1.setText("0"); option2.setText("0"); option3.setText("0"); option4.setText("0"); option5.setText("10"); option6.setText("0");
		    	
		    	
		    }else if
			    
			 ((count <= 4) && (sizeMB >= 100) && (video.length == 1) && (secret.length == 1)) {
		    	streaming.setText("Streaming file detected");
		    	sensitivefield.setText("Sensitive file detected");
		    	result.setText("Fog to Cloud");	
		    	option1.setText("10"); option2.setText("0"); option3.setText("0"); option4.setText("0"); option5.setText("10"); option6.setText("0");
		    	
		    	
		    }else if
			    
			 ((count <= 4) && (sizeMB <= 100) && (video.length == 0) && (secret.length == 0)) {
		    	streaming.setText("Streaming file NOT detected");
		    	sensitivefield.setText("Sensitive file NOT detected");
		    	result.setText("Cloud to Fog");	
		    	option1.setText("0"); option2.setText("10"); option3.setText("0"); option4.setText("0"); option5.setText("0"); option6.setText("0");
		    	
		    	// connect tabs together show results
		    }else if
			    
			 ((count <= 4) && (sizeMB <= 100) && (video.length == 0) && (secret.length == 1)) {
		    	streaming.setText("Streaming file NOT detected");
		    	sensitivefield.setText("Sensitive file detected");
		    	result.setText("Fog");
		    	option1.setText("10"); option2.setText("10"); option3.setText("0"); option4.setText("0"); option5.setText("0"); option6.setText("0");
		    	
		    	
		    }else if
			    
			 ((count <= 4) && (sizeMB <= 100) && (video.length == 1) && (secret.length == 0)) {
		    	streaming.setText("Streaming file detected");
		    	sensitivefield.setText("Sensitive file NOT detected");
		    	result.setText("Fog");	
		    	option1.setText("0"); option2.setText("0"); option3.setText("0"); option4.setText("0"); option5.setText("0"); option6.setText("0");
		    	
		    	
		    }else if
			    
			 ((count <= 4) && (sizeMB <= 100) && (video.length == 1) && (secret.length == 1)) {
		    	streaming.setText("Streaming file detected");
		    	sensitivefield.setText("Sensitive file detected");
		    	result.setText("Fog");
		    	option1.setText("10"); option2.setText("0"); option3.setText("0"); option4.setText("0"); option5.setText("0"); option6.setText("0");

		    	
		    	
		    	
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
				functionBlock.evaluate();;

				// Show output variable's chart
				Variable Recommendation = functionBlock.getVariable("Recommendation");
				JFuzzyChart.get().chart(Recommendation, Recommendation.getDefuzzifier(), true);
				

				// Print ruleSet
				
				System.out.println("REC:" + functionBlock.getVariable("Recommendation").getValue());
				
				int number = (int) Recommendation.getValue();

			  
		        if ((number == 1) || (number == 2) || (number == 3) || (number == 4) || (number == 5) || (number == 6) || (number == 7) || (number == 8) || (number == 9) || (number == 10)) {
		           box.setText("Thing To Fog to Cloud (T2F2C)");
		        }
		        else if ((number == 11) || (number == 12) || (number == 13) || (number == 14) || (number == 15) || (number == 16) || (number == 17) || (number == 18) || (number == 19) || (number == 20)) {
		        	box.setText("Thing to Cloud (T2C)");
		        }
		        else if ((number == 21) || (number == 2) || (number == 23) || (number == 24) || (number == 25) || (number == 26) || (number == 27) || (number == 28) || (number == 29) || (number == 30)) {
		        	box.setText("Thing to Fog (T2F)");
		        }
		        else if ((number == 31) || (number == 32) || (number == 33) || (number == 34) || (number == 35) || (number == 36) || (number == 37) || (number == 38) || (number == 39) || (number == 40)) {
		        	box.setText("Thing to Cloud to Fog (T2C2F)");
			           
			    
			        }
			           
		        }      
			
	
	
	

	@Override
	public void initialize (URL location, ResourceBundle resources )  {
		

		
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
			
			
			
		}
	
	
	

		
	@FXML
	public void close(ActionEvent event) {
		System.exit(0); 
	}
	
	public static Map<String, Object> jsonToMap(String str){
		Map<String, Object> map = new Gson().fromJson(
			str, new TypeToken<HashMap<String, Object>>() {}.getType()
			);
			return map;
		}
	
	
	 @FXML
		private void Clear(ActionEvent event) {
		 
		 on.setVisible(setVisible(false));
	    	off.setVisible(!on.isVisible());
			 on1.setVisible(setVisible(false));
		    	off1.setVisible(!on1.isVisible());
				 on2.setVisible(setVisible(false));
			    	off2.setVisible(!on2.isVisible());
			    	communicateimage.setVisible(setVisible(false));
			    	sensorimage.setVisible(setVisible(false));
			    	actuatingimage.setVisible(setVisible(false));
		 
		 
		 location.setText("");
		 degrees.setText("");
		 output.setText("");
		 showresults.setText("");
	 }
	 
	 
	 
	 @FXML
	 private void returntomain(ActionEvent event) {
		 
		 
			Stage menuStage = new Stage();
			Menu c = new Menu();
			c.start(menuStage);
			menuStage.show();
			
		    Stage stage = (Stage) returnbutton.getScene().getWindow();
		    stage.close();
		 
	
	 }
	
	}
	


	

	
		
	


