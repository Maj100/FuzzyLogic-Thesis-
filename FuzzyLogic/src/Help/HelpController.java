package Help;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public class HelpController implements Initializable {

	@FXML
	JFXButton btn1, btn2, btn3, btn4, btn5, btn1a, btn1b, btn1c, btn2a, btn3a, btn3b, btn3c, btn3c1, btn3c2, btn3c3,
			btn3c4, btn4a, btn4b, btn4c, btn5a;

	@FXML
	AnchorPane helpmain, p1, p1a, p2, p3, p3a, p3b, p3c, p4, p4a, p5;

	public void initialize(URL location, ResourceBundle resources) {

	}

	@FXML
	private void Openhelp(ActionEvent event) {

		if (event.getSource() == btn1) {

			p1.setVisible(true);

		}

		else if (event.getSource() == btn1a) {

			helpmain.setVisible(true);
			p1.setVisible(false);

		} else if (event.getSource() == btn1b) {

			p1.setVisible(false);
			p1a.setVisible(true);

		}

		else if (event.getSource() == btn1c) {

			p1.setVisible(true);
			p1a.setVisible(false);

		}

		else if (event.getSource() == btn2) {

			p2.setVisible(true);

		} else if (event.getSource() == btn2a) {

			helpmain.setVisible(true);
			p2.setVisible(false);

		}

		else if (event.getSource() == btn3) {

			p3.setVisible(true);

		} else if (event.getSource() == btn3a) {

			helpmain.setVisible(true);
			p3.setVisible(false);

		}

		else if (event.getSource() == btn3b) {

			p3.setVisible(false);
			p3a.setVisible(true);

		}

		else if (event.getSource() == btn3c) {

			p3.setVisible(true);
			p3a.setVisible(false);

		}

		else if (event.getSource() == btn3c1) {

			p3a.setVisible(false);
			p3b.setVisible(true);

		}

		else if (event.getSource() == btn3c2) {

			p3a.setVisible(true);
			p3b.setVisible(false);

		} else if (event.getSource() == btn3c3) {

			p3c.setVisible(true);
			p3b.setVisible(false);

		} else if (event.getSource() == btn3c4) {

			p3c.setVisible(false);
			p3b.setVisible(true);

		}

		else if (event.getSource() == btn4) {

			p1.setVisible(false);
			p4.setVisible(true);

		}

		else if (event.getSource() == btn4a) {

			helpmain.setVisible(true);
			p4.setVisible(false);

		} else if (event.getSource() == btn4b) {

			p4a.setVisible(true);
			p4.setVisible(false);

		} else if (event.getSource() == btn4c) {

			p4a.setVisible(false);
			p4.setVisible(true);

		} else if (event.getSource() == btn5) {

			helpmain.setVisible(false);
			p5.setVisible(true);

		}

		else if (event.getSource() == btn5a) {

			helpmain.setVisible(true);
			p5.setVisible(false);

		}

	}
}
