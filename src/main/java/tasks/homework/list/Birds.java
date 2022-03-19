package tasks.homework.list;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Birds {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        for (String str : myList) {
            System.out.println("--" + str + "--");
        }

        int count = 0;
        for (String str : myList) {
            Pattern pattern = Pattern.compile("[ауеэоыяию]");
            Matcher m = pattern.matcher(str);
            int vowalscount = 0;
            while (m.find()) {
                vowalscount++;
            }
            if (vowalscount > 1) {
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < myList.size(); i++){
            System.out.print(myList.get(i) + " ");
        }

        System.out.println();

        myList.set(3, "Синица");

        for ( String str : myList){
            System.out.print(str + " ");
        }
    }
}
