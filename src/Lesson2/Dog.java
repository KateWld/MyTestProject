package Lesson2;

public class Dog {

    String name;
    String home;

    public Dog(String name, String home) {
        this.name = name;
        this.home = home;
    }

    String getName() {
        return this.name;
    }

    public String getHome() {
        return this.home;
    }

    void setName(String newName){

        this.name = newName;
    }

    public void setWeight(String newHome) {
        this.home = newHome;
    }

}