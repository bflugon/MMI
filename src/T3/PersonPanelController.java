package T3;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.net.URL;
import java.util.ResourceBundle;

import T3.Gender;
import T3.Person;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class PersonPanelController implements Initializable, PropertyChangeListener{

	public TextField nameField;
	public TextField dateField;
	public TextField emailField;
	public Slider heightSlider;
	public ChoiceBox<Gender> genderMenu;
		
	public Person model;
	
	public void updateModel(){
		model.setName(nameField.getText());
		model.setDateOfBirth(dateField.getText());
		model.setEmail(emailField.getText());
		model.setGender(genderMenu.getValue());
		model.setHeight(heightSlider.getValue());
	}
	
	public void updateView(){
		nameField.setText(model.getName());
		dateField.setText(model.getDateOfBirth());
		emailField.setText(model.getEmail());
		heightSlider.setValue(model.getHeight());
		genderMenu.setValue(model.getGender());
	}
	
	public void makePassive(){
		nameField.setEditable(false);
		dateField.setEditable(false);
		emailField.setEditable(false);
		heightSlider.setDisable(true);;
		genderMenu.setDisable(true);
	}
	
	public void setModel(Person model){
		this.model = model;
		model.addPropertyChangeListener(this);
		updateView();
	}
	
	public Person getModel(){
		return model;
	}

	public void initialize(URL arg0, ResourceBundle arg1) {
		assert nameField != null : "fx:id=\"nameField\" was not injected: check your FXML file.";
		assert emailField != null : "fx:id=\"emailField\" was not injected: check your FXML file.";
		assert heightSlider != null : "fx:id=\"heightSlider\" was not injected: check your FXML file.";
		assert dateField != null : "fx:id=\"dateField\" was not injected: check your FXML file.";
		assert genderMenu != null : "fx:id=\"genderMenu\" was not injected: check your FXML file.";
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		Object val = evt.getNewValue();
		
		switch (evt.getPropertyName()){
		case Person.NAME_PROPERTY:
			nameField.setText((String)val);
			return;
		case Person.EMAIL_PROPERTY:
			emailField.setText((String)val);
			return;
		case Person.GENDER_PROPERTY:
			genderMenu.setValue((Gender)val);
			return;
		case Person.HEIGHT_PROPERTY:
			heightSlider.setValue((double)val);
			return;
		case Person.DATE_PROPERTY:
			dateField.setText((String)val);
			return;
		}
	}
}
