package seminar_4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task_3<Integer> task3 = new Task_3<>();
        System.out.println(task3.stackSize());
        task3.stackPush(1);
        task3.stackPush(2);
        task3.stackPush(34);
        task3.stackPush(-9);
        task3.stackPush(112);
        System.out.println(task3);
        System.out.println(task3.stackPop());
        System.out.println(task3);

        Task_3<String> stringTask3 = new Task_3<>();
        stringTask3.stackPush("Hello, World");
        stringTask3.stackPush("Hello, jony");
        stringTask3.stackPush("Hello");
        stringTask3.stackPush("World");
        System.out.println(stringTask3);


    }
}
