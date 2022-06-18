package Lesson2;

public class Cat {

    private String color;
    private int weight;

    public Cat(String color, int weight) {
        this.color = color;
        this.weight = weight;

    }

    String getColor() {
      return this.color;
    }

    public int getWeight() {
        return weight;
    }

    void setColor(String newColor){

        this.color = newColor;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
}
