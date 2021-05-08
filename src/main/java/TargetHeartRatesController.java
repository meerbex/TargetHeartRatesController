import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class TargetHeartRatesController {

    @FXML
    private Button calculateButton;

    @FXML
    private TextField ageTextField;

    @FXML
    private Label mhtResult;

    @FXML
    private Label thtrResult;

    @FXML
    private  Label justText;

    @FXML
    void onCalculateButtonPressed(ActionEvent event) {
        try {
            float age = Float.parseFloat(ageTextField.getText());;

            float HRmax = 220 - age;
            int THTmax = (int) (HRmax*0.85);
            int THTmin = (int) (HRmax*0.5);

            mhtResult.setText(HRmax+" bpm");
            thtrResult.setText(THTmin + " - " + THTmax +" bpm");

            justText.setText("");
        }
        catch(Exception e) {
            if (e.getMessage() == "empty String"){
                justText.setText("Your age can not be empty");
            }
            else {
                justText.setText("Your age must be in numbers");

            }
            justText.setTextFill(Color.color(1, 0, 0));
        }

    }

}
