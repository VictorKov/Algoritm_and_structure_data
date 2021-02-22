package Homework.Lesson5;

import java.util.ArrayList;
import java.util.List;

public class HomeworkLesson5 {
    public static void main(String[] args) {
        System.out.println(extent(5,5));
        System.out.println("----");

        List<Anything> items = new ArrayList<>();
        items.add(new Anything("Журнал", 5, 1000));
        items.add(new Anything("Компас", 3, 10000));
        items.add(new Anything("Котелок", 1, 7000));
        items.add(new Anything("Спички", 1, 500));
        items.add(new Anything("Палатка", 6, 15000));

        Backpack backpack = new Backpack(7);
        backpack.calcBestSet(items);

        for (Anything item : backpack.getBestSet()) {
            System.out.println(item.getName() + " " + item.getPrise());
        }

        System.out.println("Наилучшая общая цена " + backpack.getBestPrise());


    }

    private static long extent(long value, long extent) {

        if (extent == 0){
            return 1;
        }

        if (extent == 1){
            return value;
        }


        return value * extent(value, extent - 1); //Покажите, пожалуйста, пример с хвостовой рекурсией
    }

    private static void exerciseWithBackpack(Object [] arr){

    }
}
