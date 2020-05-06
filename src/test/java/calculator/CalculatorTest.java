package calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator;

    @Test
    public void setDividendTestPositive() {
        calculator.getddValidator().setValidation(false);
        calculator.getddValidator().setErrorMessage(null);
        String[] test = new String[]{"147","-9","0","98.45","-367832.11"};

        for(String iterator:test){
            Assert.assertTrue(calculator.setDividend(iterator).isValidation());
            Assert.assertNull(calculator.setDividend(iterator).getErrorMessage());
        }

    }

    @Test
    public void setDividendTestNegative(){
        calculator.getddValidator().setValidation(true);
        calculator.getddValidator().setErrorMessage(null);
        String[] test = new String[]{"jnI","0,89","98.4.5","300/7"};

        for(String iterator:test){
            Assert.assertFalse(calculator.setDividend(iterator).isValidation());
            Assert.assertNotNull(calculator.setDividend(iterator).getErrorMessage());
        }

    }

    @Test
    public void setDivisorTestPositive() {
        calculator.getdrValidator().setValidation(false);
        calculator.getdrValidator().setErrorMessage(null);
        String[] test = new String[]{"147","-9","98.45","-367832.11"};

        for(String iterator:test){
            Assert.assertTrue(calculator.setDivisor(iterator).isValidation());
            Assert.assertNull(calculator.setDivisor(iterator).getErrorMessage());
        }

    }

    @Test
    public void setDivisorTestNegative(){
        calculator.getdrValidator().setValidation(true);
        calculator.getdrValidator().setErrorMessage(null);
        String[] test = new String[]{"jnI","0,89","98.4.5","300/7","0"};

        for(String iterator:test){
            Assert.assertFalse(calculator.setDivisor(iterator).isValidation());
            Assert.assertNotNull(calculator.setDivisor(iterator).getErrorMessage());
        }

    }


    @Before
    public void setup(){
        calculator = new Calculator();
    }

}