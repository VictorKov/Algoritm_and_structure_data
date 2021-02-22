package Homework.Lesson5;

import java.util.List;

public class Backpack{

    private int maxWeight;
    private int bestPrice;
    private List<Anything> bestItems = null;

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    private int calcWeight(List<Anything> items){
        int sum = 0;
        for (Anything i: items) {
            sum += i.getWeight();
        }
        return sum;
    }

    private int calcPrise(List<Anything> items){
        int sum = 0;
        for (Anything i: items) {
            sum += i.getPrise();
        }
        return sum;
    }

    private void

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
