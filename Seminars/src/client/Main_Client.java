package client;

import client.imple.Cat;
import client.imple.Dag;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Main_Client {

    public static void main(String[] args) {
        Cat cat = new Cat(1, "Barsik", LocalDate.of(2012, 3, 5), new Owner(123), true);

        Dag dag = new Dag(2, "Шарик", LocalDate.of(2000, 1, 24), new Owner(456), true);

        Animal animal = new Cat(3, "Kesha", LocalDate.of(2012, 3, 5), new Owner(999), true);

        HashMap<Animal, Owner> animalOwner = new HashMap<>();
        animalOwner.put(cat, cat.getOwner());
        animalOwner.put(dag, dag.getOwner());
        animalOwner.put(animal, animal.getOwner());
        System.out.println(animalOwner);
        Cat.meow();
    }
}
