package tasks.homework.cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {

        CycleWhile cycleWhile = new CycleWhile();
        cycleWhile.test();

        System.out.println();

        CycleFor cycleFor = new CycleFor();
        cycleFor.numbers();

        System.out.println();

        CycleArray cycleArray = new CycleArray();
        cycleArray.foo();

        System.out.println();

        ReverseArray reverseArray = new ReverseArray();
        reverseArray.reverse();

        System.out.println();

        ArrayMultiply arrayMultiply = new ArrayMultiply();
        arrayMultiply.arrayMultiplyFive();

        System.out.println();

        ArraySqrt arraySqrt = new ArraySqrt();
        arraySqrt.task();

        System.out.println();

        ChangeArray changeArray = new ChangeArray();
        changeArray.positionChange();

        System.out.println();

        SortArray sortArray = new SortArray();
        sortArray.descendingSorting();



    }
}
