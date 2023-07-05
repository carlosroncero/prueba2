import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import App.java;

public class AppTest {
    @Test
    void Eshola() {
        // Sumar aa = new Sumar();
        // assertEquals(5, aa.sumar2(2, 3));
        App bb = new App();
        assertEquals(5, bb.sumar(2, 3));
        assertTrue(bb.sumar(5,4)==9);
    }

}
