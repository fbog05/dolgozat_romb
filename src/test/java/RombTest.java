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
        this.rombusz.calcDistrict;
    }
}
