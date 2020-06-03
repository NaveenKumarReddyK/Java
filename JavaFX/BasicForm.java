
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert.AlertType;

public class BasicForm extends Application {
    @Override
    public void start(Stage stage) {

        Text nameLabel = new Text("Name");
        TextField nameField = new TextField();
        Text ageLabel = new Text("Age");
        TextField ageField = new TextField();
        Text address = new Text("Address");
        TextField addrField = new TextField();
        Text marksLabel = new Text("12th Marks");

        Text mathsMarks = new Text("Maths");
        TextField mathsField = new TextField();
        Text phyMarks = new Text("Physics");
        TextField phyField = new TextField();
        Text chemMarks = new Text("Chemistry");
        TextField chemField = new TextField();

        Text cLabel = new Text("Course Interested");

        ToggleGroup courseGroup = new ToggleGroup();
        RadioButton eeeRadio = new RadioButton("EEE");
        eeeRadio.setToggleGroup(courseGroup);
        RadioButton cseRadio = new RadioButton("CSE");
        cseRadio.setToggleGroup(courseGroup);
        RadioButton itRadio = new RadioButton("IT");
        itRadio.setToggleGroup(courseGroup);
        RadioButton eceRadio = new RadioButton("ECE");
        eceRadio.setToggleGroup(courseGroup);

        Text sportsText = new Text(" Sports Interested");
        CheckBox football = new CheckBox("Football");
        football.setIndeterminate(false);
        CheckBox cricket = new CheckBox("Cricket");
        cricket.setIndeterminate(false);
        CheckBox basketBall = new CheckBox("BasketBall");
        basketBall.setIndeterminate(false);
        CheckBox volleyball = new CheckBox("Volleyball");
        volleyball.setIndeterminate(false);
        CheckBox tennis = new CheckBox("Tennis");
        tennis.setIndeterminate(false);


        Button subitButton = new Button("Submit");
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(500, 500);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameField, 1, 0);
        gridPane.add(ageLabel, 0, 1);
        gridPane.add(ageField, 1, 1);
        gridPane.add(address, 0, 2);
        gridPane.add(addrField, 1, 2);
        gridPane.add(marksLabel,0,3);
        gridPane.add(mathsMarks, 0, 4);
        gridPane.add(mathsField,1,4);
        gridPane.add(phyMarks, 0, 5);
        gridPane.add(phyField,1,5);
        gridPane.add(chemMarks, 0, 6);
        gridPane.add(chemField,1,6);
        gridPane.add(cLabel,0,7);
        gridPane.add(eeeRadio,0,8);
        gridPane.add(eceRadio,1,8);
        gridPane.add(cseRadio,0,9);
        gridPane.add(itRadio,1,9);
        gridPane.add(sportsText,0,10);
        gridPane.add(football,0,11);
        gridPane.add(cricket,1,11);
        gridPane.add(basketBall,2,11);
        gridPane.add(volleyball,0,12);
        gridPane.add(tennis,1,12);
        gridPane.add(subitButton,0,13);
        Alert submitAlert = new Alert(Alert.AlertType.CONFIRMATION,"your details is updated");
        EventHandler<ActionEvent> submitEvent = new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent e)
                    {
                        submitAlert.show();
                    }
                };
        subitButton.setOnAction(submitEvent);

        gridPane.setStyle("-fx-background-color: BEIGE;");
        Scene scene = new Scene(gridPane);
        stage.setTitle("B.E Course Registration Form");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
