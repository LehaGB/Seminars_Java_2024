package seminar_4;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.Scanner;

public class Task_2 {

    static LinkedList<String> list = new LinkedList<>();
/*
    Реализовать консольное приложение, которое:
    Принимает от пользователя строку вида
    text:num
    Нужно сделать “сплит” строки по : , сохранить text в связный список на позицию num.
    Если введено print:num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */
    public static void main(String[] args) {

        while (true){
           PrintLst();
        }
    }
    public static void PrintLst(){
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String[] array = text.split(":");
        String world = array[0];
        int num = Integer.parseInt(array[1]);
        if(num  > list.size()){
            for (int i = 0; i <= num ; i++) {
                list.add(null);
            }
        }
        if(world.equals("print")){
            System.out.println(list.get(num));
            list.remove(num);
        } else {
            list.add(num, world);
        }
    }
}
