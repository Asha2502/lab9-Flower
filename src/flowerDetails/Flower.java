package flowerDetails;

import flowerParts.Bud;
import flowerParts.Petal;

import java.util.Objects;

//14. Создать объект класса Цветок, используя классы Лепесток, Бутон.
// Методы: расцвести, завять, вывести на консоль цвет бутона.
public class Flower {

    private Petal petals;
    private Bud bud;
    private String name;

    public Flower(String name, int countPetals, String color, boolean condition) {
        petals = new Petal(countPetals);
        bud = new Bud(color, condition);
        this.name = name;
    }

    public Bud getBud() {
        return bud;
    }

    public void setBud(Bud bud) {
        this.bud = bud;
    }

    public void blossomFlower(){
        bud.blossom();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String printColor(){
        return  "Цвет бутона: " + bud.getColor();
    }

    @Override
    public String toString() {
        return "Цветок{" +"имя='" + name + "\' ; " +
                  petals +
                 bud +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Objects.equals(name, flower.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(petals.getCountPetals());
    }
}
