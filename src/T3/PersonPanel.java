package T3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PersonPanel extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PersonPanel.fxml"));
        Parent root = (Parent) loader.load();
        primaryStage.setTitle("PersonPanel");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        Person person = new Person();
        person.setName("Bob");
        person.setDateOfBirth("Aldri");
        person.setEmail("bob@loblaw.com");
        person.setHeight(170);
        person.setGender(Gender.MALE);

        PersonPanelController controller = loader.getController();
        controller.setModel(person);
    }


    public static void main(String[] args) {
        launch(args);



    }


}
