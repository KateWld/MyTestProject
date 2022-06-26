package Lesson5;

public abstract class Car {

    boolean speed;
    boolean light;

    public Car(boolean speed, boolean light) {
        this.speed = speed;
        this.light = light;
    }

    public boolean isSpeed() {
        return speed;
    }

    public void setSpeed(boolean speed) {
        this.speed = speed;
    }

    public boolean isLight() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }

    public void moving(boolean speed) {
        if (speed) {
            System.out.println("Машина начала движение");
        } else {
            System.out.println("Машина остановилась");
        }
    }

       public void  lighting (boolean light){
            if (light) {
                System.out.println("Фары включены");
            } else {
                System.out.println("Фары выключены");
            }

        }
    }
