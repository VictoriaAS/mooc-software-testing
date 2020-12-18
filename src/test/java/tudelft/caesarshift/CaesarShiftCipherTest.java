package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    @Test
    public void Shift3() {
        CaesarShiftCipher shif = new CaesarShiftCipher();
        String s =
                shif.CaesarShiftCipher("abc", 3);
        Assertions.assertEquals("def", s);
    }

    @Test

    public void InvalidChar() {
        CaesarShiftCipher shif = new CaesarShiftCipher();
        String s =
                shif.CaesarShiftCipher("r45", 3);
        Assertions.assertEquals("invalid", s);
    }
    @Test

    public void ShiftMinus3() {
        CaesarShiftCipher shif = new CaesarShiftCipher();
        String s =
                shif.CaesarShiftCipher("def", -3);
        Assertions.assertEquals("abc", s);
}
    @Test

    public void ShiftUpperChar() {
        CaesarShiftCipher shif = new CaesarShiftCipher();
        String s =
                shif.CaesarShiftCipher("ABC", -3);
        Assertions.assertEquals("invalid", s);

    }}