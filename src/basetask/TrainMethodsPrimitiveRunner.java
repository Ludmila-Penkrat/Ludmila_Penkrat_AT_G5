package basetask;

public class TrainMethodsPrimitiveRunner {
    public static void main(String[] args) {

        TrainMethodsPrimitive tmp = new TrainMethodsPrimitive();
        tmp.printInt(-1_000_000);
        tmp.printLong(2_000_000_000_000L);
        tmp.printChar('g');
        tmp.printFloat(2.50f);
        tmp.printDouble(5.555555555);
        tmp.printShort((short) 31766);
        tmp.printByte((byte) 10);
        tmp.printBoolean(true);
    }
}
