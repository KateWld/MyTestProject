package Lesson2;

public class Homework2 {
    public static void main(String[] args) {

        int count = 0;

       for (int i = 0; i < 100; i++){
         count = i;
         count++;
         System.out.print(count + "a ");
        }

        int ageChildren = 10;

        if (ageChildren<=6){
            System.out.println("Пошёл в сад");
        }
       if (ageChildren>6 && ageChildren<=11) {
           System.out.println("Пошёл в младшую школу");
       }
        if (ageChildren>11 && ageChildren<=17) {
            System.out.println("Пошёл в среднюю школу");
        }
       if (ageChildren>17) {
            System.out.print("Пошёл в университет");
        }

        boolean chicken = true;
        boolean vegetables = false;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;

        if (chicken == true && vegetables == true && sour == true && toast == true){
            System.out.println("Цезарь готов, сэр!");
        }
        if (vegetables == true && sausage == true || eggs == true ) {
            System.out.println("Оливье готово, сэр!");
        }
        if (vegetables == true && chicken == false && sour == false && toast == false&& eggs == false && sausage == false) {
            System.out.println("Овощной салат готов, сэр!");
        }
        if (chicken == false && vegetables == false && sour == false && toast == false && eggs == false && sausage == false)  {
            System.out.print("У меня ничего нет");
        }

      Cat catVasiliy = new Cat("Black",3);
      Dog dogIgor = new Dog("Igor","Moscow");

    }

}
