package tasks.homework.list;

import java.util.*;
import java.util.regex.Matcher;

public class SandRunner {

    public static void main(String[] args) {

        List<Sand> sandbox = new ArrayList<>();

        Sand sand1 = new Sand(2, "Речной");
        Sand sand2 = new Sand(4, "Речной");
        Sand sand3 = new Sand(2, "Карьерный");
        Sand sand4 = new Sand(7, "Речной");

        sandbox.add(sand1);
        sandbox.add(sand2);
        sandbox.add(sand3);
        sandbox.add(sand4);

        for (Sand sandWeight : sandbox){
            System.out.print(sandWeight.getWeight() + " ");
        }
        System.out.println();
        for (Sand sandName : sandbox){
            System.out.print(sandName.getName() + " ");
        }
        System.out.println();

        Map<Integer, Sand> sandList = new HashMap<>();

        sandList.put(sand1.hashCode(), sand1);
        sandList.put(sand2.hashCode(), sand1);
        sandList.put(sand3.hashCode(), sand1);
        sandList.put(sand4.hashCode(), sand1);

        for (int key : sandList.keySet()){
            System.out.print(key + " ");
        }
        System.out.println();

        for (Sand value : sandList.values()){
            System.out.print(value + " ");
        }
        System.out.println();

        for (Map.Entry<Integer, Sand> entry : sandList.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
