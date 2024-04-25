import flowerDetails.Flower;
import flowerDetails.FlowerList;
import flowerParts.Bud;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Flower> flowers;
        FlowerList list = new FlowerList();
        flowers = list.init();
        for (Flower fl : flowers) {
            System.out.println(fl);
        }


        if(flowers.getFirst().equals(flowers.getLast()))
            System.out.println("\nОго, два тюльпана!");

        if(flowers.get(0).hashCode() == flowers.get(1).hashCode())
            System.out.println("\nУ тюльпана и розы одинаковое количество лепестков!");

        Scanner sc = new Scanner(System.in);
        System.out.print("\nВведите имя цветка: ");
        String name = sc.next();
        for (Flower fl : flowers) {
            if(name.equals(fl.getName())){
                fl.blossomFlower();
                System.out.println(fl.printColor());
            }
        }

//        Bud bud = new Bud(false);
//        flowers.get(2).setBud(bud);
//        System.out.println("Ой!");
//        flowers.get(2).blossomFlower();
    }
}