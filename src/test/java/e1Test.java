import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class e1Test {
    e1 prueba = new e1();

    @Test
    public void testelevar1()
    {
        assertEquals(8,prueba.elevar1(2,3));
    }
}