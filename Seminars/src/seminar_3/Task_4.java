package seminar_3;

import java.util.ArrayList;
import java.util.List;

public class Task_4 {
    public static void main(String[] args) {
        List<ArrayList<String>> catalog = new ArrayList<>();
        catalog.add(new ArrayList<>(List.of("Проза", "Война и Мир", "Буратино")));
        catalog.add(new ArrayList<>(List.of("Поэзия", "Бородино", "Евгений Онегин")));
        System.out.println(catalog);

        catalog.add(1, new ArrayList<>(List.of("Cтихи", "Пушкин", "Усунин")));
        System.out.println(catalog);
        List<String> m = new ArrayList<>();
        for (int i = 0; i < catalog.size(); i++){
            Object item = catalog.get(0);
            if(item != null){
                catalog.reversed();
            }
        }
        System.out.println(catalog);

    }
}
