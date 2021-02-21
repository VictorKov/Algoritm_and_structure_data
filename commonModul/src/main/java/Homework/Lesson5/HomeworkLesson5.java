package Homework.Lesson5;

public class HomeworkLesson5 {
    public static void main(String[] args) {
        System.out.println(extent(5,5));
        System.out.println("----");
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
