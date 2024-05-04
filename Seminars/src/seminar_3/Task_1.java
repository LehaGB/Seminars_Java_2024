package seminar_3;

import java.util.*;

public class Task_1 {

    public static void main(String[] args) {


        RandomNumber();
    }
    public static void RandomNumber(){
        Random random = new Random();
        List<Integer> number = new ArrayList<>();
        int size_num = 10;
        for (int i = 0; i < size_num; i++) {
            number.add(random.nextInt(0, 100));
        }
        System.out.println(number);
        Collections.sort(number);
        System.out.println(number);
        Integer max = Collections.max(number);
        System.out.println(max);
        Integer min = Collections.min(number);
        System.out.println(min);
    }
}
