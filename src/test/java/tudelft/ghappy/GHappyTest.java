package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void XXggXXx() {
        GHappy hg = new GHappy();
        boolean result = hg.gHappy("xxgxx");
        Assertions.assertFalse(result);


    }

    @Test
    public void XXggXX() {
        GHappy hg = new GHappy();
        boolean result = hg.gHappy("xxggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void XgggXgX() {
        GHappy hg = new GHappy();
        boolean result = hg.gHappy("xgggxgx");
        Assertions.assertFalse(result);
    }
    @Test
    public void XttgXgX() {
        GHappy hg = new GHappy();
        boolean result = hg.gHappy("xttgxgx");
        Assertions.assertFalse(result);
}}
