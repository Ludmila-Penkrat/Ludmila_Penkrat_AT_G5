package basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {

        TrainMethodsIf tmi = new TrainMethodsIf();

        System.out.println("Метод returnNewInt вернул " + tmi.returnNewInt(8));

        System.out.println("Метод returnNewLong вернул " + tmi.returnNewLong(200));

        System.out.println("Метод returnNewChar вернул " + tmi.returnNewChar('g'));

        System.out.println("Метод returnNewFloat вернул " + tmi.returnNewFloat(0.67f));

        System.out.println("Метод returnNewDouble вернул " + tmi.returnNewDouble(10));

        tmi.returnNewBoolean(true);

    }




}
