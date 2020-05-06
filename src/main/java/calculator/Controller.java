package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    Validator dividendOk;
    Validator divisorOk;


    Calculator calculator;

    public Controller(){
        calculator = new Calculator();
    }

    @FXML
    private TextField dividend;

    @FXML
    private TextField divisor;


    @FXML
    private TextField result;

    @FXML
    private Text error;


    @FXML //if "Результат" button is clicked
    public void buttonClick(ActionEvent actionEvent){
        if(actionEvent.getSource() instanceof Button){
            error.setOpacity(0.0);
            checkDividend();
            checkDivisor();
            if (divisorOk.isValidation()&&dividendOk.isValidation()){
                result.setText(calculator.division());
            }
        }
    }

    @FXML
    public void clearDisplay(ActionEvent actionEvent){
        if(actionEvent.getSource() instanceof Button){
            dividendOk.setValidation(false);
            divisorOk.setValidation(false);
            dividend.clear();
            divisor.clear();
            error.setOpacity(0.0);
            result.clear();
        }


    }

    /**
     * Check if dividend is number in appropriate format. If not display an error message
     */
    public void checkDividend(){
        dividendOk = calculator.setDividend(dividend.getText());
        if(!dividendOk.isValidation()){
            error.setText(dividendOk.getErrorMessage());
            error.setOpacity(1.0);
        }
    }

    /**
     * Check if divisor is number in appropriate format ant not zero. If not display an error message
     */
    public void checkDivisor(){
      divisorOk = calculator.setDivisor(divisor.getText());
      if(!divisorOk.isValidation()){
          error.setText(divisorOk.getErrorMessage());
          error.setOpacity(1.0);
      }
    }
}
