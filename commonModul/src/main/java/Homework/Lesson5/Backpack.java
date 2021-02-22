package Homework.Lesson5;

import java.util.ArrayList;
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

    private void checkSet(List<Anything> items){

        int sumPrise = calcPrise(items);
        int sumWeight = calcWeight(items);

        if(sumWeight <= maxWeight && (bestItems == null || sumPrise > bestPrice)){
            bestItems = items;
            bestPrice = sumPrise;
        }
    }

    public List<Anything> getBestSet(){
        return bestItems;
    }

    public void calcBestSet(List<Anything> items){
        if (items.isEmpty()){
            return;
        }

        checkSet(items);

        for (int i = 0; i < items.size(); i++) {
            List<Anything> copItems = new ArrayList<>(items);
            copItems.remove(i);
            calcBestSet(copItems);
        }
    }

    public int getBestPrise(){
        return bestPrice;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
