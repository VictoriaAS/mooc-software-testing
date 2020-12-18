package tudelft.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VLeapYearTest {
    @Test
    public void leapYearThatAreNotCenturialYears(){

        LeapYear ly = new LeapYear();
        boolean leap = ly.isLeapYear(2016);
        Assertions.assertTrue(leap);
    }
    @Test
    public void leapYearCenturialYear(){
   LeapYear ly = new LeapYear();
     boolean leap = ly.isLeapYear(2000);
     Assertions.assertTrue(leap);
    }
    @Test
    public void nonLeapCenturialYear() {
        LeapYear ly = new LeapYear();
        boolean leap = ly.isLeapYear(1400);
        Assertions.assertFalse(leap);

    }
    @Test
    public void nonLeapNonCenturialYear(){
        LeapYear ly = new LeapYear();
        boolean leap = ly.isLeapYear(1977);
        Assertions.assertFalse(leap);
    }
}
