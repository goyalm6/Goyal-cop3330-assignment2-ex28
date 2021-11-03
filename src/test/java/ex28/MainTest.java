package ex28;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void getTotalShouldReturnCorrectTotal() {
        int result =  ex28.Main.getTotal(1, 2, 3, 4, 5);
        assertEquals(15, 15);
    }

    @Test
    void getTotalShouldReturnCorrectTotal2() {
        int result =  ex28.Main.getTotal(10, 20, 30, 40, 50);
        assertEquals(150, 150);
    }
}