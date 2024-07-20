import java.util.*;
import java.util.Random;

public class numbergame {
    public static void guessnumber(int random, int n) {
        int temp = 0;
        System.out.println(
                " ------------------------NUMBER GAME STARTS-----------------");
        System.out.println("MAXIMUM NUMBER OF ATTEMPTS:" + n);
        System.out.println("ROUND 1 STARTS");
        for (int i = 1; i <= n; i++) { // ROUND 1
            System.out.println("ENTER YOUR GUESS:");
            Scanner sc = new Scanner(System.in);
            int guess = sc.nextInt();
            // CHECKING THE GUESS
            if (guess == random) {
                int s = temp + 1;
                System.out.println("CONGRATS!. YOU GOT IT RIGHT");
                System.out.println("SCORE OF ROUND 1:" + s);
                break;
            } else {

                if (guess > random) {
                    System.out.println("OH! IT'S TOO HIGH");
                } else {
                    System.out.println("IT'S TOO LOW");
                }
                if (i == n) {
                    System.out.println(" YOU HAVE REACHED THE ATTEMPT LIMIT");
                    System.out.println("CORRECT ANS:" + random);
                    System.out.println("SCORE OF ROUND 1:" + temp);
                }

            }
        }

    }

    public static void guessnumberound2(int random, int n) {
        System.out.println("ROUND 2 STARTS");
        int temp = 0;
        for (int i = 1; i <= n; i++) { // ROUND 2
            System.out.println("ENTER YOUR GUESS:");
            Scanner sc = new Scanner(System.in);
            int guess = sc.nextInt();
            // CHECKING THE GUESS
            if (guess == random) {
                int s = temp + 1;
                System.out.println("CONGRATS!. YOU GOT IT RIGHT");
                System.out.println("SCORE OF ROUND 2:" + s);
                break;
            } else {

                if (guess > random) {
                    System.out.println("OH! IT'S TOO HIGH");
                } else {
                    System.out.println("IT'S TOO LOW");
                }
                if (i == n) {
                    System.out.println(" YOU HAVE REACHED THE ATTEMPT LIMIT");
                    System.out.println("CORRECT ANS:" + random);
                    System.out.println("SCORE OF ROUND 2:" + temp);
                }
            }
        }
    }

    public static void guessnumberound3(int random, int n) {
        System.out.println("ROUND 3 STARTS");
        int temp = 0;
        for (int i = 1; i <= n; i++) { // ROUND 3
            System.out.println("ENTER YOUR GUESS:");
            Scanner sc = new Scanner(System.in);
            int guess = sc.nextInt();
            // CHECKING THE GUESS
            if (guess == random) {
                int s = temp + 1;
                System.out.println("CONGRATS!. YOU GOT IT RIGHT");

                System.out.println("SCORE OF ROUND 3:" + s);
                break;
            } else {
                if (guess > random) {
                    System.out.println("OH! IT'S TOO HIGH");
                } else {
                    System.out.println("IT'S TOO LOW");
                }
                if (i == n) {
                    System.out.println(" YOU HAVE REACHED THE ATTEMPT LIMIT");
                    System.out.println("CORRECT ANS:" + random);
                    // PRINTING SCORE OF EACH ROUND
                    System.out.println("SCORE OF ROUND 3:" + temp);
                }

            }
        }
    }

    public static void main(String[] args) {
        // METHOD TO GENERATE RANDOM NO
        Random r = new Random();
        // random= r.nextInt((max-min+1)+min)
        int random1 = r.nextInt((100 - 1 + 1) + 1);
        int random2 = r.nextInt((100 - 1 + 1) + 1);
        int random3 = r.nextInt((100 - 1 + 1) + 1);
        int n = 5; // max no of attempts
        guessnumber(random1, n);
        guessnumberound2(random2, n);
        guessnumberound3(random3, n);

    }
}
