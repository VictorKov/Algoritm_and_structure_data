package Test_DZ;

import StackAndQueue.deque.Deque;
import StackAndQueue.deque.DequeImpl;
import StackAndQueue.stack.IStack;
import StackAndQueue.stack.StackImpl;

public class Test3Dz {
    public static void main(String[] args) {

        //TASK 1

        System.out.println("TASK 1");
        String str = "Hello World!";
        IStack<Character> reverse = new StackImpl<>(str.length());

        for (int i = 0; i < str.length(); i++) {
            reverse.push(str.charAt(i)); // записываю каждый символ отдельно в отделную ячейку массива char из строки
        }

        while (!reverse.isEmpty()){
            System.out.print(reverse.pop()); //пока массив перебор не дошел до 0 индекса, выводим список символов с последнего до 0.
        }

        System.out.println("-------");

        System.out.println("TASK 2");

        Deque<Integer> deque = new DequeImpl<>(6);

        insertRight(deque, 5);
        insertRight(deque, 2);
        insertRight(deque, 4);
        insertRight(deque, 7);
        insertLeft(deque, 1);
        insertLeft(deque, 3);

      //  displayLeftToRight(deque);
       // displayRightToLeft(deque);

        System.out.println();
        System.out.println("Remove");

        removeRight(deque);
        removeLeft(deque);

        displayLeftToRight(deque);



    }

    private static <E> void insertRight(Deque<E> deq, E value){
        if (!deq.isFull()){
            deq.insertRight(value);
        }
    }

    private static <E> void insertLeft(Deque<E> deq, E value){
        if (!deq.isFull()){
            deq.insertLeft(value);
        }
    }

    private static <E> void removeRight(Deque<E> deq){
        if (!deq.isEmpty()){
            deq.removeRight();
        }
    }

    private static <E> void removeLeft(Deque<E> deq){
        if (!deq.isEmpty()){
            deq.removeLeft();
        }
    }

    private static <E> void displayRightToLeft(Deque<E> deq){
        while (!deq.isEmpty()){
            System.out.println(deq.removeRight());
        }
    }

    private static <E> void displayLeftToRight(Deque<E> deq){
        while (!deq.isEmpty()){
            System.out.println(deq.removeLeft());
        }
    }

}
