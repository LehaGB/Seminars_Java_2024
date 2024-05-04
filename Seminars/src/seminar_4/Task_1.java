package seminar_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
          TheAddNumberArrayList();
        //TheAddNumberLinkedList();
    }
    //Добавление элементов в конец списка и замеряем время.
    public static void TheAddNumberArrayList(){
        ArrayList<Integer> intArrayList = new ArrayList<>();
        int lenght = 10_000_000;

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < lenght; i++) {
            intArrayList.add(i);
        }

        long endTime = System.currentTimeMillis();

        double result = endTime - startTime;

        System.out.printf("Run time for arr Arraylist %s %s %n", result, "ms");

        int count = 0;

        long startTime1 = System.currentTimeMillis();
        Random rnd = new Random();


        while (count != 1000){
            intArrayList.add(40000, rnd.nextInt());
            count += 2;
        }

        long endTime1 = System.currentTimeMillis();

        double result1 = endTime1 - startTime1;
        System.out.print(result1 + "ms");
    }


    //Добавление элементов в конец списка и замеряем время.
    public static void TheAddNumberLinkedList(){
        LinkedList<Integer> intLinkedList = new LinkedList<>();
        int lenght = 10_000_000;

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < lenght; i++) {
            intLinkedList.add(i);
        }

        long endTime = System.currentTimeMillis();

        double result = endTime - startTime;

        System.out.printf("Run time for arr Linkedlist %s %s %n", result, "ms");

        int count = 0;

        long startTime1 = System.currentTimeMillis();
        Random rnd = new Random();


        while (count != 1000){
            intLinkedList.add(40000, rnd.nextInt());
            count += 2;
        }

        long endTime1 = System.currentTimeMillis();

        double result1 = endTime1 - startTime1;
        System.out.print(result1 + "ms");
    }
}
