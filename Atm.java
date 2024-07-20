
import java.util.*;

class useracc {
    private static int pin = 5209;

    public static int getPin() {
        return pin;
    }

    // setter of balance
    public static void setPin(int pin) {
        useracc.pin = pin;
    }

    // getter of balance
    private double balance = 100000;

    // function to deposit money
    public useracc() {
    }

    // func. to withdraw
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // function to change pin
    public double getBalance() {
        return balance;
    }

    public void deposit(double b) {
        if (b >= 0) {
            balance = balance + b;
            System.out.println("NEW BALANCE" + balance);
        } else {
            System.out.println("INVALID DEPOSIT");
        }
    }

    public void withdraw(double b) {
        if (b > 0 && b <= balance) {
            balance = balance - b;
            System.out.println("NEW BALANCE" + balance);

        } else {
            System.out.println("INVALID TRANSACTION");
        }

    }

    public void changepin() {
        Random r = new Random();
        int otp = r.nextInt((9999 - 1000 + 1) + 1000);
        System.out.println("current pin:" + pin);
        System.out.println("otp generated" + otp);
        System.out.println("enter new pin");
        Scanner sc = new Scanner(System.in);
        int npin = sc.nextInt();
        pin = npin;
        System.out.println("pin changed successfuly");

    }
}

// NEW CLASS ATM
public class Atm {
    public static void main(String[] args) {
        // CREATING OBJECT OF USERACC CLASS INORDER TO ACCESS ITS FUNCTIONS
        useracc obj = new useracc();
        int choice;
        System.out.println("-------------------------WELCOME TO ATM----------------- ");
        do {
            System.out.println(
                    "ENTER YOUR CHOICE:\n 1.CHECK BALANCE \t 2. DEPOSIT \t 3.WITHDRAWAL \t 4.CHANGE PIN \t 5.EXIT");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("YOUR CURRENT BALANCE:" + obj.getBalance());
                    break;
                }

                case 2: {
                    System.out.println("ENTER THE AMOUNT TO BE DEPOSITED:");
                    double amt = sc.nextDouble();
                    obj.deposit(amt);
                    break;
                }
                case 3: {
                    System.out.println("ENTER THE AMOUNT TO BE withdrawal:");
                    double a = sc.nextDouble();
                    obj.withdraw(a);
                    System.out.println("YOUR CURRENT BALANCE:");

                    break;
                }
                case 4: {
                    obj.changepin();
                    break;
                }
                case 5: {
                    System.out.println("THANK YOU FOR BANKING WITH US");
                    break;
                }
                default: {
                    System.out.println(" invalid choice");

                }

            }

        } while (choice != 5);

    }

}
