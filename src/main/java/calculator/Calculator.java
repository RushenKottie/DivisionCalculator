package calculator;


public class Calculator {


    public Validator getddValidator() {
        return ddValidator;
    }
    public Validator getdrValidator() {
        return drValidator;
    }

    private Validator ddValidator = new Validator();
    private Validator drValidator = new Validator();
    private double dividend;
    private double divisor;

    public String division(){
        double result = dividend / divisor;
        return Double.toString(result);
    }

    public Validator setDividend(String dividend) {
        try{
            this.dividend = Double.parseDouble(dividend);
            ddValidator.setValidation(true);
        }catch (NumberFormatException e){
            ddValidator.setValidation(false);
            ddValidator.setErrorMessage("Введено некорректное значение. Введите только цифры. Для дробных чисел используйте точку.");
        }
        return ddValidator;
    }

    public Validator setDivisor(String divisor) {
        try{
            this.divisor= Double.parseDouble(divisor);
            drValidator.setValidation(true);
            if(this.divisor==0.0){
                drValidator.setErrorMessage("Деление на 0 недопустимо");
                drValidator.setValidation(false);
            }

        }catch (NumberFormatException e){
            drValidator.setValidation(false);
            drValidator.setErrorMessage("Введено некорректное значение. Введите только цифры. Для дробных чисел используйте точку.");
        }

        return drValidator;
    }


}
