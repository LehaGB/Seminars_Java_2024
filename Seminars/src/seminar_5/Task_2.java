package seminar_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Task_2 {
    /*
    Написать метод, который переводит число из римского формата записи в арабский.
    Например, MMXXII = 2022
     */
    public static void main(String[] args) {
        System.out.println(numberTranslationromanToArabic("MCMLXXXV"));
    }
    public static int numberTranslationromanToArabic(String roman){
        Map<String, Integer> map = Map.of(
                "I", 1,
                "V", 5,
                "X", 10,
                "L", 50,
                "C", 100,
                "D", 500,
                "M", 1000
        );
        int result = 0;
        //MMXXII = 2022
        List<Integer> numList = new ArrayList<>();
        String[] arr = roman.split("");
        for (int i = 0; i < arr.length; i++) {
            numList.add(map.get(arr[i]));
        }
        for (int i = 0; i < numList.size() - 1; i++) {
            if(numList.get(i) >= numList.get(i + 1)){
                result += numList.get(i);
            }
            else {
                result -= numList.get(i);
            }
        }
        result += numList.getLast();
        return result;
    }
}
