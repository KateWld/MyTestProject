package Lesson5;


import java.io.*;

public class Lesson5 {
    public Lesson5() throws IOException {
    }

    public static void main(String[] args) throws IOException {

Car toyota = new Toyota(true,true);
        toyota.moving(toyota.speed);

        FileReader fileReader = new FileReader("D:\\Job\\repos\\MyTestProject\\comesFolder\\my_first_file.txt");
        FinancialRecord incomeRecord = new FinancialRecord(500,300);

        BufferedReader reader = new BufferedReader(new FileReader("D:\\Job\\repos\\MyTestProject\\comesFolder\\my_first_file.txt"));
        String result = "";
        while (reader.ready()){
            result += reader.readLine();

        }
        System.out.println(result + " ");
        fileReader.close();

        FileWriter fileWriter = new FileWriter("D:\\Job\\repos\\MyTestProject\\comesFolder\\report.txt");

        fileWriter.write(String.valueOf(incomeRecord));

        fileWriter.close();
    }



  //  BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Job\\repos\\MyTestProject\\comesFolder\\report.txt"));





}
