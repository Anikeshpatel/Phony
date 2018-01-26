package grp.anon.calcy;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Calcy implements Initializable {

    @FXML
    private BorderPane root;

    @FXML
    private HBox status_bar;

    @FXML
    private TextField show_status;

    @FXML
    private TextField show_ans;

    @FXML
    private JFXButton btn7;

    @FXML
    private JFXButton btn4;

    @FXML
    private JFXButton btn1;

    @FXML
    private JFXButton dotBtn;

    @FXML
    private JFXButton btn8;

    @FXML
    private JFXButton btn5;

    @FXML
    private JFXButton btn2;

    @FXML
    private JFXButton btn0;

    @FXML
    private JFXButton delBtn;

    @FXML
    private JFXButton mulBtn;

    @FXML
    private JFXButton subBtn;

    @FXML
    private JFXButton addBtn;

    @FXML
    private JFXButton btn9;

    @FXML
    private JFXButton btn6;

    @FXML
    private JFXButton btn3;

    @FXML
    private JFXButton eqlBtn;

    @FXML
    private JFXButton divBtn;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    void calculate(ActionEvent event) {
        String id = getId(event.getSource().toString());
        switch (id){
            case "btn1":
                show_status.appendText("1");
                break;
            case "btn2":
                show_status.appendText("2");
                break;
            case "btn3":
                show_status.appendText("3");
                break;
            case "btn4":
                show_status.appendText("4");
                break;
            case "btn5":
                show_status.appendText("5");
                break;
            case "btn6":
                show_status.appendText("6");
                break;
            case "btn7":
                show_status.appendText("7");
                break;
            case "btn8":
                show_status.appendText("8");
                break;
            case "btn9":
                show_status.appendText("9");
                break;
            case "btn0":
                show_status.appendText("0");
                break;
            case "delBtn":
                if (show_status.getText().length() > 0){
                    show_status.setText(show_status.getText(0,show_status.getText().length()-1));
                }
                break;
            case "addBtn":
                show_status.appendText(" + ");
                break;
            case "subBtn":
                show_status.appendText(" - ");
                break;
            case "divBtn":
                show_status.appendText(" / ");
                break;
            case "mulBtn":
                show_status.appendText(" x ");
                break;
            case "eqlBtn":
                getAns();
                break;
        }
    }

    private String getId(String data){
        return data.substring(data.indexOf("=")+1,data.indexOf(","));
    }
    private void getAns(){
        String data = show_status.getText();
        Integer firstNo = Integer.parseInt(data.substring(0,data.indexOf("+")).trim());
        Integer secondNo = Integer.parseInt(data.substring(data.indexOf("+")+1,data.length()).trim());
        show_ans.setText(String.valueOf(firstNo + secondNo));
    }
}
