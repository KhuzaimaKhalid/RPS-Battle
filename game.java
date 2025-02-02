package oops_harry;

import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        System.out.println("RPS Battle");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for rock, 2 for paper and 3 for scissor = ");
        int userinput = sc.nextInt();
        Random random = new Random();
        int computerinput = random.nextInt(3) + 1;
        if (userinput == computerinput) {
            System.out.println("DRAW");
        } else if (userinput == 1 && computerinput == 3 || userinput == 3 && computerinput == 2 || userinput == 3 && computerinput == 2) {
            System.out.println("YOU WIN!");
        } else {
            System.out.println("COMPUTER WIN");
        }

        if (computerinput == 1) {
            System.out.println("Computer choice = ROCK");
        } else if (computerinput == 2) {
            System.out.println("Computer choice = PAPER");
        } else if (computerinput == 3) {
            System.out.println("Computer choice = SCISSOR");
        }
    }
}