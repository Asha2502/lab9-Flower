package flowerDetails;

import flowerDetails.Flower;

import java.util.ArrayList;

public class FlowerList {
    public ArrayList<Flower> flower = new ArrayList<>();
    public ArrayList init() {
        flower.add(new Flower("тюльпан",5, "сиреневый", false));
        flower.add(new Flower("роза", 5, "красный", true));
        flower.add(new Flower("пион", 10, "белый", true));
        flower.add(new Flower("лилия",7, "розовый", true));
        flower.add(new Flower("нарцисс",4, "желтый", false));
        flower.add(new Flower("тюльпан",5, "оранжевый", false));
        return flower;
    }
}
