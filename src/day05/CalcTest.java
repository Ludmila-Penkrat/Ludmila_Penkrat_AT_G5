package day05;

import java.util.concurrent.Callable;

public class CalcTest {

    public static void main(String[] args) {

        Calc calc = new Calc();

        doTest("addition", calc.calculate("+",2, 5), 7);
        doTest("subtraction", calc.calculate("-", 3, 1), 2);
        doTest("multiplication", calc.calculate("*",10,2), 20);
        doTest("division", calc.calculate("/", 16,8), 2);

    }
    private static void doTest(String testName, int actual, int expected) {
        if (actual == expected){
            System.out.println("Test  " + testName + " PASSED");
        } else {
            System.out.println("Test  " + testName + " FAILED");
        }
    }
}
