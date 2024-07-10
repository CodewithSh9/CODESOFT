
import java.util.*;

public class studgrade {

    public static void main(String[] args) {
        int n;
        int tot = 0;
        System.out.println("Enter no.of subjects:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) { // user can enter as many no. of subjects marks
            int sub = sc.nextInt();
            System.out.println();
            tot += sub;
        }

        int avg = tot / n;
        System.out.println(tot);
        System.out.println(avg);
        char grade; // allotting grades
        if ((90 <= avg) || (avg >= 100)) {
            grade = 'A';
            System.out.println(grade + " " + "EXCELLENT");

        } else if ((80 <= avg) || (avg >= 89)) {
            grade = 'B';
            System.out.println(grade + " " + "GOOD");
        } else if ((70 <= avg) || (avg >= 79)) {
            grade = 'C';
            System.out.println(grade + " " + "AVERAGE");
        } else if ((60 <= avg) || (avg >= 69)) {
            grade = 'D';
            System.out.println(grade + " " + "OK");
        } else if ((50 <= avg) || (avg >= 59)) {
            grade = 'E';
            System.out.println(grade + " " + "BELOW AVERAGE");
        } else if ((40 <= avg) || (avg >= 49)) {
            grade = 'F';
            System.out.println(grade + " " + "NEED IMPROVE");
        } else {
            grade = 'O';
            System.out.println(grade + " " + "FAILED");
        }

    }

}
