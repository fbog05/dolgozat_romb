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
    }

    @Test
    public void testCalcArea(){
        this.rombusz.calcArea();
    }
}
