package tasks.homework.list;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChairRunner {

    public static void main(String[] args) {

        List<Chair> chairs = Arrays.asList(
                new Chair(1, 2),
                new Chair(4, 2),
                new Chair(2, 4)
        );

        for (Chair chWidth : chairs) {
            System.out.print(chWidth.getWidth() + " ");
        }
        System.out.println();

        for (Chair chHeight : chairs) {
            System.out.print(chHeight.getHeight() + " ");
        }
        System.out.println();

        for (Chair ch : chairs) {
            System.out.print((ch.getHeight() * ch.getWidth() + " "));
        }
        System.out.println();

        Map<Integer, Chair> myChair = new HashMap<>();

        for (int i = 0; i < chairs.size(); i++) {
            myChair.put(i, chairs.get(i)); // как сделать, чтоб вместо i (0,1,2) выводися HashCode?
        }

        for (int key : myChair.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        for (Chair ch : myChair.values()) {
            System.out.print(ch + " ");
        }
        System.out.println();

        for (Map.Entry<Integer, Chair> entry : myChair.entrySet()) {
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
    }
}
