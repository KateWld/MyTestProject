package Lesson1;

import java.util.Arrays;

public class Lesson {
    public static void LessonNew() {

        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';

        String trimmedHi = hi.trim();
        String worldToLowerCase = world.toLowerCase();

        String result = trimmedHi + worldToLowerCase +  newLine;

        String repeated = result.repeat(3);

        System.out.println(repeated);

        double growth = 1.85;
        double growthCount = growth * growth;
        double weight = 90;
        double indexWeight = weight / growthCount;

        System.out.println(indexWeight);


        char[] myArray = new char[5];
        myArray[0] = 'a';
        myArray[1] = 'b';
        myArray[2] = 'c';
        myArray[3] = 'd';
        myArray[4] = 'e';

        Arrays.toString(myArray);

        System.out.println(myArray);

        char[] myArray2 = myArray;
        myArray[3] = 'h';
        System.out.println(myArray2);
    }
}
