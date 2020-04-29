package calculator;


public class Calculator {


    public Validator getValidator() {
        return validator;
    }

    private Validator validator = new Validator();
    private double dividend;
    private double divisor;
    private double result;

    public String division(){
        result = dividend/divisor;
        return Double.toString(result);
    }

    public Validator setDividend(String dividend) {
        try{
            this.dividend = Double.parseDouble(dividend);
            validator.setValidation(true);
        }catch (NumberFormatException e){
            validator.setValidation(false);
            validator.setErrorMessage("Введено некорректное значение. Введите только цифры. Для дробных чисел используйте точку.");
        }
        return validator;
    }

    public Validator setDivisor(String divisor) {
        try{
            this.divisor= Double.parseDouble(divisor);
            validator.setValidation(true);
            if(this.divisor==0.0){
                validator.setErrorMessage("Деление на 0 недопустимо");
                validator.setValidation(false);
            }


        }catch (NumberFormatException e){
            validator.setValidation(false);
            validator.setErrorMessage("Введено некорректное значение. Введите только цифры. Для дробных чисел используйте точку.");
        }

        return validator;
    }


}
