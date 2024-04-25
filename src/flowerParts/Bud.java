package flowerParts;

import java.util.Objects;

public class Bud {
    private String color;
    private boolean blossom;
    public Bud(String color, boolean cond){
        this.color = color;
        this.blossom = cond;
    }
    public Bud(String color){
        this.color = color;
    }
    public Bud(boolean cond){
        this.blossom = cond;
    }

    public boolean isBlossom() {
        return blossom;
    }

    public void setBlossom(boolean blossom) {
        this.blossom = blossom;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void blossom() {
        if(isBlossom())
            System.out.println("Бутон расцвел :)");
        else
            System.out.println("Бутон завял :(");
    }


    @Override
    public String toString() {
            return  color+" бутон";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bud bud = (Bud) o;
        return blossom == bud.blossom && Objects.equals(color, bud.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, blossom);
    }
}
