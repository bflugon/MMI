package T3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PersonPanel extends Application {

    public TextField textField;

    @Override
    public void start(Stage primaryStage) throws Exception{
    	FXMLLoader panel = new FXMLLoader(getClass().getResource("PersonPanel.fxml"));
    	Parent root = (Parent) panel.load();
    	
        primaryStage.setTitle("Personsssssss");
        
        Scene scene = new Scene(root, 400, 600);
        
        
        primaryStage.centerOnScreen();
        primaryStage.setScene(scene);
        primaryStage.show();
        
        //Passive
        
        FXMLLoader passive = new FXMLLoader(getClass().getResource("PersonPanel.fxml"));
        Parent passiveRoot = (Parent) passive.load();

        Scene passiveScene = new Scene(passiveRoot,400,600);

        Stage passiveStage = new Stage();
        passiveStage.setTitle("Passive");
        passiveStage.setScene(passiveScene);
        passiveStage.show();
              
        //Set model
        
        Person person = new Person("Jens", "12.12.2012", Gender.MALE, "jenseboy@yahoo.com", 120.0);
        
        PersonPanelController controller = panel.getController();
        controller.setModel(person);
        
        PersonPanelController passiveController =passive.getController();
        passiveController.setModel(person);
        passiveController.makePassive();
    }


    public static void main(String[] args) {
        launch(args);
    }


}