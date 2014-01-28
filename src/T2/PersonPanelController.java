package T2;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;


public class PersonPanelController {
    public TextField name;
    public TextField email;
    public TextField dateOfBirth;
    public ComboBox gender;
    public Slider height;

    private Person model;

    public void action(ActionEvent actionEvent) {
        if (model != null) {
            setModel(null);
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

    }
}
