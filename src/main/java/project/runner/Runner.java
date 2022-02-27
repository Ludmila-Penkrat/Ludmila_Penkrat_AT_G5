package project.runner;

import project.boxing.Bottle;

public class Runner {
    public static void main(String[] args) {

        Bottle bottlefirst = new Bottle(0.5);
        Bottle bottlesecond = new Bottle(1.0);
        Bottle bottlethird = new Bottle(1.5);

        bottlefirst.open();
        System.out.println();
        bottlesecond.open();
        System.out.println();
        bottlethird.open();


    }
}
