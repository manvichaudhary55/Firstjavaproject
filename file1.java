package Firstjavaproject;

import java.util.Scanner;
import java.util.Random;

public class file1 {

    public static void main(String[] args) {
        // 0 rock
        // 1 paper
        // 2 scissors
        System.out.println("YOUR CHOICE: 0=rock,1=paper,2=scisors");
        Scanner sc = new Scanner(System.in);
        int userinput = sc.nextInt();
        if (userinput == 0) {
            System.out.println("you choose ROCK");
        } else if (userinput == 1) {
            System.out.println("you choose PAPER");
        } else {
            System.out.println("you choose SCISSORS");
        }

        Random rn = new Random();
        int computerinput = rn.nextInt(3);

        if (userinput == computerinput) {
            System.out.println("DRAW");
        } else if (userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 0
                || userinput == 2 && computerinput == 1) {
            System.out.println("YOU WINN!!");
        } else {
            System.out.println("BETTER LUCK NEXT TIME");
        }
        if (computerinput == 0) {
            System.out.println("computer choose ROCK");
        } else if (computerinput == 1) {
            System.out.println("computer choose PAPER");
        } else {
            System.out.println("computer choose SCISSORS");
        }
        if (userinput > 2) {
            System.out.println("INVALID INPUT");
        }

    }
}
