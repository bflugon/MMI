package T2;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

/**
 * Created by bard on 1/17/14.
 */
public class PersonPanelController {
    public TextField name;
    public TextField email;
    public TextField dateOfBirth;
    public ComboBox gender;
    public Slider height;

    private Person model;

    public void action(ActionEvent actionEvent) {
        if (model != null) {
            setModel();
        }
    }

    public void setModel() {

    }
}
