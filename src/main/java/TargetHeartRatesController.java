import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
    void onCalculateButtonPressed(ActionEvent event) {
        float age = Float.parseFloat(ageTextField.getText());;

        float HRmax = 220 - age;
        int THTmax = (int) (HRmax*0.85);
        int THTmin = (int) (HRmax*0.5);

        mhtResult.setText(HRmax+" bpm");
        thtrResult.setText(THTmin + " - " + THTmax +" bpm");

    }

}
