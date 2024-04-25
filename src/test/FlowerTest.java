package test;

import flowerDetails.Flower;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    @Test
    void equals(){
        Flower fl1 = new Flower("роза", 5, "красный", true);
        Flower fl2 = new Flower("пион", 5, "красный", true);
        boolean real = fl1.equals(fl2);
        assertFalse(real);
    }

    @Test
    void hashcode(){
        Flower fl1 = new Flower("роза", 10, "белый", false);
        Flower fl2 = new Flower("пион", 5, "красный", true);
        boolean real = fl1.hashCode()==fl2.hashCode();
        assertFalse(real);
    }

    @Test
    void printcolor(){
       Flower fl = new Flower("лилия",7, "розовый", true);
       String realStr = fl.printColor();
       assertEquals("Цвет бутона: розовый", realStr);
    }

}