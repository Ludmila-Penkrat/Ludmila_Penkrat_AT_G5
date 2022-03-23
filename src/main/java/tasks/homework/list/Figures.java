package tasks.homework.list;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Figures {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("myFile.txt");

        List<String> myList = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");

        String str1 = String.join("-", myList);
            fw.write(str1);

        fw.close();

        int count = 0;
        for (String st : myList){
            if(!st.contains("и")){
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < myList.size(); i++){
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();

        myList.set(3,"Треугольник");

        for (String strr : myList){
            System.out.print(strr + " ");
        }
        System.out.println();

        List<String> myList1 = new ArrayList<String>(Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"));

        for (String s : myList1){
            System.out.print(s + " ");
        }
        System.out.println();
        myList1.add(3, "Треугольник");

        for (String s1 : myList1){
            System.out.print(s1 + " ");
        }
    }
}
