package tasks.homework.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaterRunner {

    public static void main(String[] args) {

        List<Water> water = Arrays.asList(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный")
        );

        for (Water waterList : water){
            System.out.println(waterList.getColor() + "-" + waterList.getSmell());
        }
    }
}
