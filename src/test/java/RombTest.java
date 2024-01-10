import java.util.InputMismatchException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.example.Rombusz;

public class RombTest {
    
    Rombusz rombusz;

    @BeforeTest
    public void setup(){
        this.rombusz = new Rombusz();
    }

    @Test
    public void testCalcDistrict(){
        double actual = this.rombusz.calcDistrict(10.0);
        double expected = 40.0;
        Assert.assertEquals(actual, expected, 0.1);
    }

    @Test
    public void testCalcArea(){
        double actual = this.rombusz.calcArea(10.0, 30.0);
        double expected = 50.0;
        Assert.assertEquals(actual, expected, 0.1);
    }

    @Test
    public void testCalcArea2(){
        double actual = this.rombusz.calcArea(20.0, 35.0);
        double expected = 229.4;
        Assert.assertEquals(actual, expected, 0.1);
    }

    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalcDistrict_Zero_Side(){
        this.rombusz.calcDistrict(0);
    }

    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalcArea_Zero_Side(){
        this.rombusz.calcArea(0, 1);
    }

    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalcArea_Zero_Angle(){

    }
}
