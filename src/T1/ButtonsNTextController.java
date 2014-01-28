package T1;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

import java.awt.*;

public class ButtonsNTextController {


    public TextField textField;

    public ToggleGroup grp;
    public ToggleButton btn1;
    public ToggleButton btn2;
    public CheckBox checkbox;


    public void upperCase() {
        textField.setText(textField.getText().toUpperCase());
    }

    public void lowerCase() {
        textField.setText(textField.getText().toLowerCase());
    }

    public void handleAction() {

        if (btn1.isSelected()) {
            upperCase();
        }
        else if (btn2.isSelected()) {
            lowerCase();
        }
    }

    public void handleCont() {
        if (checkbox.isSelected()) {
            int pos = textField.getCaretPosition();
            handleAction();
            textField.positionCaret(pos);
        }
    }

    public void handleChk(ActionEvent actionEvent) {
        if (checkbox.isSelected()) {
            handleAction();
        }
    }
}



