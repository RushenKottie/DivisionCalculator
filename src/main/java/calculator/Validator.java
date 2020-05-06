package calculator;

/**
 * This class is for objects-flags, which validate if the entered value is correct. If the value is not correct
 * the Validator also stores error message for display
 */
public class Validator {


    private boolean validation = false;
    private String errorMessage;

    public boolean isValidation() {
        return validation;
    }

    public void setValidation(boolean validation) {
        this.validation = validation;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
