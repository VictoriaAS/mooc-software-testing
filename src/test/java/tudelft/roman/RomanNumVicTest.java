package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumVicTest {
    private RomanNumeral roman1;
    @BeforeEach
    public void initialize() {
        this.roman1 = new RomanNumeral();

    }
    @Test
    void singleNum(){
        RomanNumeral roman1 = new RomanNumeral();
        int result = roman1.convert("I");

       // Assertions.assertEquals(expected:1, result);
        Assertions.assertEquals( 1, result);
    }
    @Test

    void numberWithManyDigits(){
      RomanNumeral  roman1 = new RomanNumeral();
      int result = roman1.convert("VIII");
      Assertions.assertEquals(8,result);
}
@Test
    void numberWithSubtractiveNotation(){
        RomanNumeral roman1 = new RomanNumeral();
    int result = roman1.convert("IV");
        Assertions.assertEquals(4,result);
}
@Test
    void numberWithDigitAndSubstNotation(){
        RomanNumeral roman1 = new RomanNumeral();
        int result = roman1.convert("XIX");
        Assertions.assertEquals(19,result);
    }
    @Test
    void numWithOrWithoitSubtNotation(){
        RomanNumeral roman1 = new RomanNumeral();
        int result = roman1.convert("XLIV");
        Assertions.assertEquals(44, result);
    }
}
