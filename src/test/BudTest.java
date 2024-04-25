package test;

import flowerDetails.Flower;
import flowerParts.Bud;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BudTest {

    @Test
    void tostring1() {
        Flower fl1 = new Flower("роза", 10, "белый", false);
        assertEquals("белый бутон", fl1.getBud().toString());
    }

    @Test
    void tostring2() {
        Bud fl1 = new Bud( "белый");
        assertEquals("белый бутон", fl1.toString());
    }

    @Test
    void equals() {
        Bud bud1 = new Bud( "белый", true);
        Bud bud2 = new Bud( "белый", false);
        assertFalse(bud1.equals(bud2));
    }

    @Test
    void hashcode() {
        Bud bud1 = new Bud( "белый", true);
        Bud bud2 = new Bud( "красный", true);
        assertFalse(bud1.hashCode()==bud2.hashCode());
    }


}