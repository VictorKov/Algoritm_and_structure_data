package Homework.Lesson5;

public class Anything {
    private String name;
    private int weight;
    private int prise;

    public Anything(String name, int weight, int prise) {
        this.name = name;
        this.weight = weight;
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }
}
