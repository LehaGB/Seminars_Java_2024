package seminar_3;

import java.util.ArrayList;
import java.util.List;

public class Lesson3 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

//        String a = "mama";
//        String b = "Mama";
//        System.out.println(a.equals(b));
//
//        List<Integer> list = new ArrayList();
//        list.add(1);
//        list.add(5);
//        list.add(3);
//
//        //foreach в Java.
//        for (Integer obj: list) {
//            if(obj != null){
//                obj.intValue();
//            }
//            System.out.print(obj + " ");
//        }

        List<Integer> list = List.of(1, 3, 5, 6, 9);
        List<Integer> list1 = new ArrayList(list);
        for (int i : list1){
            System.out.print(i + " ");
        }
        System.out.println();
        list1.remove(3);
        System.out.print(list1);
        System.out.println();
        System.out.print(list);
    }
}
