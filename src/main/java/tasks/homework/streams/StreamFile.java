package tasks.homework.streams;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class StreamFile {

    public static void main(String[] args) throws IOException {

        SimpleDateFormat formater = new SimpleDateFormat("dd MMMM yyyy", Locale.ENGLISH);
        Date date = new Date();


        List<String> listString = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader("E:/IT/text.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            listString.add(line);
        }
        reader.close();

        for (String str : listString) {
            System.out.println(str);
        }
        Arrays.stream(listString.stream()
                        .skip(4)
                        .collect(Collectors.joining())
                        .split("\\."))
                        .filter(s -> s.startsWith("Date log:"))
                        .map(x -> x.substring(0, 20) + " - " + formater.format(date))
                        .forEach(System.out::println);
    }
}
