package basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn tmr = new TrainMethodsReturn();
        System.out.println("Метод ReturnNewInt вернул " + tmr.returnNewInt(10));
        System.out.println("Метод ReturnNewLong вернул " + tmr.returnNewLong(25567799));
        System.out.println("Метод ReturnNewChar вернул " + tmr.returnNewChar('s'));
        System.out.println("Метод ReturnNewFloat вернул " + tmr.returnNewFloat(2.55f));
        System.out.println("Метод ReturnNewDouble вернул " + tmr.returnNewDouble(5.555555));
        System.out.println("Метод ReturnNewShort вернул " + tmr.returnNewShort((short) 3258));
        System.out.println("Метод ReturnNewByte вернул " + tmr.returnNewByte((byte) 127));
        System.out.println("Метод ReturnNewBoolean вернул " + tmr.returnNewBoolean(false));
    }
}
