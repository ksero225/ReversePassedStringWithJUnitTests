import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringTest {

    @Test
    public void testThatReverseStringReverseStringProperly() {
        ReverseString reverseString = new ReverseString("test");
        assertEquals("tset", reverseString.reversePassedString());
    }

    @Test
    public void testThatReverseStringThrowErrorWhenStringIsEmpty() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    new ReverseString("");
                });
    }

}