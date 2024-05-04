package seminar_3;

import java.util.ArrayList;
import java.util.List;

public class Task_3 {
    public static void main(String[] args) {
        DeletingNumbers();

    }
    //Удаление чисел из списка.
    public static void DeletingNumbers(){
        List items = new ArrayList<String>();
        items.add("Hello");
        items.add(2);
        items.add("World");
        items.add(3);
        items.add("Copy");
        items.add(45);
        for (int i = 0; i < items.size(); i++) {
            Object item = items.get(i);
            if(item instanceof Integer){
                items.remove(i);
            }
        }
        System.out.println(items);
    }
}
