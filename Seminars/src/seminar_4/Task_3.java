package seminar_4;

/*
    Реализовать стэк с помощью массива.
    Нужно реализовать методы:
    size(), empty(), push(), peek(), pop().
 */

public class Task_3<T> {
    private int capacity = 2;
    private int size = 0;
    private int top = -1;
    private T[] values = (T[])new Object[capacity];

    private void addCapacity(){
        capacity *= 2;
        T[] temp = (T[])new Object[capacity];
        System.arraycopy(values, 0,  temp, 0, values.length);
        values = temp;
    }
    public int stackSize(){
        return size;
    }
    public boolean stackEmpty(){
        return top == -1;
    }
    public void stackPush(T element){
        if (capacity == size){
            addCapacity();
        }
        values[++top] = element;
        size++;
    }
    public T stackPeek(){
        if(!stackEmpty()){
            return values[top];
        }
        else {
            throw new RuntimeException("Стек пустой");
        }
    }
    public T stackPop(){
        if(stackEmpty()){
            throw new RuntimeException("Стек пустой");
        }
        else {
            stackPeek();
            size--;
        }
        return values[top--];
    }
    public  String toString() {
        if (stackEmpty()){
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < stackSize(); i++) {
            builder.append(values[i]).append(", ");
        }
        return String.format("[%s]", builder);
    }
}
