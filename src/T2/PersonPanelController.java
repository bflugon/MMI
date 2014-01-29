package T2;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;


public class PersonPanelController {
    public TextField name;
    public TextField email;
    public TextField dateOfBirth;
    public ComboBox<Gender> gender;
    public Slider height;

    private Person model;


    public void update(){
        if (model != null) {
        model.setName(name.getText());
        model.setDateOfBirth(dateOfBirth.getText());
        model.setEmail(email.getText());
        model.setHeight((float)height.getValue());
        model.gender = gender.getValue();
            System.out.println("Model updated");
        }
    }

    public Person getModel() {
        return model;
    }

    public void setModel(Person person) {
        this.model = person;
        name.setText(person.getName());
        email.setText(person.getEmail());
        dateOfBirth.setText(person.getDateOfBirth());
        height.setValue(person.getHeight());
        gender.setValue(model.getGender());

    }
}
