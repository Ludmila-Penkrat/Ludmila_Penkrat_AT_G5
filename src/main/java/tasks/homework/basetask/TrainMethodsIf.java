package tasks.homework.basetask;

public class TrainMethodsIf {

    public int returnNewInt(int aa) {
        if (aa < 8) {
            return aa * 7;
        } else {
            return aa / 4;
        }
    }

    public long returnNewLong(long bb) {
        if (bb > 300) {
            return bb - 300;
        } else {
            return bb + 20;
        }
    }

    public String returnNewChar(char cc) {
        if (cc == 'g') {
            return "go";
        } else {
            return "o" + cc;
        }
    }

    public float returnNewFloat(float dd) {
        if (dd == 0.67f) {   // почему есди не поставить f оно не воспринимается как 0,67 == 0,67, а умножает на 2?
            return dd;
        } else {
            return dd * 2;
        }
    }

    public double returnNewDouble(double ff) {
        if (ff > 30 && ff < 80) {
            return ff + 87;
        } else if (ff > 80 && ff < 400) {
            return ff - 87;
        } else if (ff > 400) {
            return ff / 4;
        } else {
            return ff;
        }
    }

    public void returnNewBoolean(boolean gg) {
        if (gg) {
            System.out.println("Я получил на вход значение истины");
        }
    }
}
