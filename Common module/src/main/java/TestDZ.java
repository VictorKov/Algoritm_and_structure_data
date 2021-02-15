import Arrays_classes.Array;
import Arrays_classes.ArrayImpl;

import java.util.Random;

public class TestDZ {
    private static final int ARRAY_CAPACITY = 100_000;
    private static final int MAX_VALUE = 10_000;


    public static void main(String[] args) {


        Array<Integer> data1 = new ArrayImpl<>(ARRAY_CAPACITY);
        Array<Integer> data2 = new ArrayImpl<>(ARRAY_CAPACITY);
        Array<Integer> data3 = new ArrayImpl<>(ARRAY_CAPACITY);

        addNumber(data1);
        addNumber(data2);
        addNumber(data3);

        resultBubble(data1);
        System.out.println("-----");
        resultSelect(data2);
        System.out.println("-----");
        resultInsert(data3);



    }

    static void resultBubble (Array<Integer> data){
        System.out.println("Started method: sortBubble");
        long s = System.currentTimeMillis();
        data.sortBubble();
        long f = System.currentTimeMillis();
        long res = f-s;
        System.out.println("Finished method: sortBubble");
        System.out.println("The time is: " + res);

    }

    static void resultSelect (Array<Integer> data){
        System.out.println("Started method: sortSelect");
        long s = System.currentTimeMillis();
        data.sortSelect();
        long f = System.currentTimeMillis();
        long res = f-s;
        System.out.println("Finished method: sortSelect");
        System.out.println("The time is: " + res);
    }

    static void resultInsert (Array<Integer> data){
        System.out.println("Started method: sortInsert");
        long s = System.currentTimeMillis();
        data.sortInsert();
        long f = System.currentTimeMillis();
        long res = f-s;
        System.out.println("Finished method: sortInsert");
        System.out.println("The time is: " + res);
    }

   static void addNumber(Array<Integer> data){
       Random rand = new Random();
       for (int i = 0; i < ARRAY_CAPACITY; i++) {
           int value = rand.nextInt(MAX_VALUE);
           data.add(value);
       }
   }
}
