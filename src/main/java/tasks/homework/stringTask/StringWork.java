package tasks.homework.stringTask;


public class StringWork {

    public static void main(String[] args) {

        String str = "Lorem Ipsum is simply dummy text. Lorem Ipsum has been the industry's standard dummy text.";
        String[] words = str.split(" ");

        for (int i = 0; i < words.length-1; i++){
            for (int j = i+1; j < words.length; j++ ){
                if (words[i].equals(words[j]) && (i != j)) {
                    words[j] = words[i];
                    System.out.println(words[j]);
                }
            }

        }

        String newStr = "from 45 BC15, making it -15 over 2000 years old";
        String newStr1 = newStr.replaceAll("\\D+", " ").trim();
        String [] newStr2 = newStr1.split(" ");
        for (int i =0; i < newStr2.length; i++){
            System.out.print(newStr2[i] + " ");
        }

        System.out.println();

        String log = "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n";

        String change = log.replaceAll("access_log.\\d{4}.\\d{2}.\\d{2}", "");
        String[] arrayFromString = change.split("[\\r\\n]");

    }
}
