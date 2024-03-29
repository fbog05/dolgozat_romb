/*
* File: RombTest.java
* Author: Ferencsik Boglárka
* Copyright: 2024, Ferencsik Boglárka
* Group: Szoft II/2/N
* Date: 2024-01-10
* Github: https://github.com/fbog05
* Licenc: GNU GPL
*/

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
    public void testCalcDistrict2(){
        double actual = this.rombusz.calcDistrict(20.0);
        double expected = 80.0;
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
        this.rombusz.calcArea(1, 0);
    }
}
