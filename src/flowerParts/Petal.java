package flowerParts;

public class Petal{
    private int countPetals;

    public Petal(int countPetals) {
        this.countPetals = countPetals;
    }

    public int getCountPetals() {
        return countPetals;
    }

    public void setCountPetals(int countPetals) {
        this.countPetals = countPetals;
    }

    @Override
    public String toString() {
        return countPetals+" лепестков ; ";
    }
}
