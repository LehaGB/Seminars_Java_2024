package seminar_6;

import java.util.HashSet;
import java.util.Set;

public class Main_Seminar_6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        Cat cat1 = new Cat("Tom");
        Set<Cat> cats = new HashSet<>();
        cats.add(cat);
        cats.add(cat1);

        System.out.println(cats);
    }
}
