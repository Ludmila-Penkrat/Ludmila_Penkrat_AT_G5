package tasks.homework.list;

import java.util.ArrayList;
import java.util.List;

public class Cities {

    public static void main(String[] args) {

        List<String> newList = new ArrayList<>();

        newList.add("Минск");
        newList.add("Москва");
        newList.add("Берлин");

        for (String str : newList) {
            System.out.println(str);
        }
        int sum = 0;
        for (int i = 0; i < newList.size(); i++) {
            sum += newList.get(i).length();
        }
        System.out.println(sum);

        for (int i = 0; i < newList.size(); i++){
            System.out.print(newList.get(i) + " ");
        }
    }
}
