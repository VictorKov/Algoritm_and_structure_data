package StackAndQueue.deque;

import StackAndQueue.stack.IStack;
import StackAndQueue.stack.StackImpl;

public class TestDZ {
    public static void main(String[] args) {

        //TASK 1

        String str = "Hello World!";
        IStack<Character> reverse = new StackImpl<>(str.length());

        for (int i = 0; i < str.length(); i++) {
            reverse.push(str.charAt(i)); // записываю каждый символ отдельно в отделную ячейку массива char из строки
        }

        while (!reverse.isEmpty()){
            System.out.print(reverse.pop()); //пока массив перебор не дошел до 0 индекса, выводим список символов с последнего до 0.
        }

    }
}
