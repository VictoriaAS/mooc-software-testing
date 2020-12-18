package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VAChocolateTest {
    @Test
    public void totalIsBiggerThanAmountOfBars(){
        ChocolateBags bags1 = new ChocolateBags();
        int result1 = bags1.calculate(1,1,10);
        Assertions.assertEquals(-1,result1);
    }
    @Test
public void OnlyBigBars(){
    ChocolateBags bags1 = new ChocolateBags();
    int result1 =  new ChocolateBags().calculate(5,3,10);
   Assertions.assertEquals(0,result1);
}
@Test
public void SmallAndBigBars(){
    ChocolateBags bags1 = new ChocolateBags();
    int result1 = new ChocolateBags().calculate(5,3,20);
    Assertions.assertEquals(5,result1);
}
@Test
    public void OnlySmallBars() {
    ChocolateBags bags1 = new ChocolateBags();
    int result1 = new ChocolateBags().calculate(5,3,4);
    Assertions.assertEquals(4,result1);
}

}