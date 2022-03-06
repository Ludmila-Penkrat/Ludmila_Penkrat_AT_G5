package tasks.homework.stringTask;

public class StringTaskIP {

    public static void main(String[] args) {

        String log = "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 333.168.101.6 denied\n" +
                "access_log.2020.09.07 444.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 555.168.101.5 granted\n";

        String change = log.replaceAll("access_log.\\d{4}.\\d{2}.\\d{2}", "");
        String[] newStr = change.split("[\\r\\n]");
        String[][] doubleString = new String[newStr.length][3];










    }
}
