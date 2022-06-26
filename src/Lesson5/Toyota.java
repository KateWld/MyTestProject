package Lesson5;

public class Toyota extends Car{

    boolean soundOn;

    public Toyota(boolean speed, boolean light) {
        super(speed, light);
    }

    public void makeToyotaSound(boolean soundOn){
        System.out.println("Тайота включила музыку");
    }
}

