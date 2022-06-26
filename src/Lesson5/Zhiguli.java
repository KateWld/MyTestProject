package Lesson5;

public class Zhiguli extends Car {

      boolean brokenZhiguli;

    public Zhiguli(boolean speed, boolean light) {
        super(speed, light);
    }

    public void makeBrokenZhiguli(boolean brokenZhiguli){
        System.out.println("Жигули сломалась");
    }
}

