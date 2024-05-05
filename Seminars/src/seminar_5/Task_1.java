package seminar_5;

import java.util.*;

public class Task_1 {
    /*
Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.
     */
    public static void main(String[] args) {
        storingEmployeeData();
    }
    public static void storingEmployeeData(){
        Map<Integer, String> map = new TreeMap<>();
        map.put(123456, "Иванов");
        map.put(321456, "Васильев");
        map.put(234561, "Петрова");
        map.put(234432, "Иванов");
        map.put(654321, "Петрова");
        map.put(345678, "Иванов");
//        System.out.println(map);
//
//        //вывод по ключу.
//        System.out.println(map.get(321456));
//
//
//        //Перезаписали значение.
//        map.put(321456, "Шаляпин");
//        System.out.println(map.get(321456));
//        System.out.println(map);
//
//        //Перезапись по ключу.
//        map.put(321456, map.get(234561));
//        System.out.println(map.get(321456));
//
//        System.out.println(map);
//
//        //entrySet - возвращает итерируемый объект, ввиде массива.
//        System.out.println(map.entrySet());

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            if(entry.getValue().equals("Иванов")){
                System.out.println(entry);
            }

        }
    }
}
