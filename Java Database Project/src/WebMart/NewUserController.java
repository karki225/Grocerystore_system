package WebMart;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

//this is the controller for the page that registers new users
public class NewUserController {
	@FXML private Label randomID; 		//displays randomly generated employee ID
	@FXML Button enterBtn; 				//enters data typed in by user and creates new employee in database
	@FXML private TextField firstTxt;	//text field to enter first name
	@FXML private TextField lastTxt;	//text field to enter last name
	@FXML private TextField phoneTxt;	//text field to enter phone number
	@FXML private TextField emailTxt;	//text field to enter email
}
