package tasks.homework.list;

import java.util.ArrayList;
import java.util.List;

public class Butterflies {

    public static void main(String[] args) {

        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String str : butterflies){
            System.out.print("\"" + str + "\"" + " ");
        }
        System.out.println();

        int count = 0;
        for (String  s : butterflies){
            if (s.contains("o")){
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < butterflies.size(); i++){
            System.out.print(butterflies.get(i) + " ");
        }
        System.out.println();

        for (String st : butterflies){
            System.out.println(st);
        }
    }
}
