package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VAParaChocolateBoundaryTest {
    @ParameterizedTest(name = "small={0}, big={1},total={2},result={3}")
    @CsvSource({//the total is more than the amount of small and big//
            "1,1,5,0","1,1,6,1", "1,14,7,-1","1,1,8,-1",})

            public void TotalIsmoreThanAmountOfBigAndSmall(int small, int big, int total, int expectedResult) {
        ChocolateBags bags1 = new ChocolateBags();
        int result = new ChocolateBags().calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }
    @ParameterizedTest(name = "small={0}, big={1},total={2},result={3}")
    @CsvSource({// No need for small bars.//
            "4,0,10,-1", "4,1,10,-1", "5,2,10,0", "5,3,10,0",})
    public void OnlyBigBars(int small, int big, int total, int expectedResult){
        ChocolateBags bags1 = new ChocolateBags();
        int result = new ChocolateBags().calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }
    @ParameterizedTest(name = "small={0}, big={1},total={2},result={3}")
    @CsvSource({// Need for big and small bars.//
            "0,3,17,-1", "1,3,17,-1", "2,3,17,2", "3,3,17,2",
            "0,3,12,-1", "1,3,12,-1", "2,3,12,2", "3,3,12,2",})

            public void bigAndSmall(int small, int big, int total, int expectedResult) {
        ChocolateBags bags1 = new ChocolateBags();
        int result = new ChocolateBags().calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }
    @ParameterizedTest(name = "small={0}, big={1},total={2},result={3}")
         @CsvSource({// Only small bars.//
                 "4,2,3,3", "3,2,3,3", "2,2,3,-1", "1,2,3,-1"})
        public void SmallBarsOnly(int small, int big, int total, int expectedResult){
        ChocolateBags bags1 = new ChocolateBags();
        int result = new ChocolateBags().calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);

       /* public void TestAlgorithm(int small, int big, int total, int expectedResult){
        int result = new ChocolateBags().calculate(small,big,total);
        Assertions.assertEquals(expectedResult,result);*/
}}
