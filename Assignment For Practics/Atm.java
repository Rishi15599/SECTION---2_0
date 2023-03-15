import java.util.Scanner;

public class Atm {
    public void pinCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("!!!!!!!!!!!!!!! Wellcome !!!!!!!!!!!!!!!");
        System.out.println("----------------------------------------");
        System.out.println("Enter Your Pin");
        int pin;
        pin = sc.nextInt();
        if (pin == 1234) {
            System.out.println("========================================");
            System.out.println("Go to Banking");
            System.out.println("----------------------------------------");
        } else {
            System.out.println("----------------------------------------");
            System.out.println("Your pin is incorrect");
            System.out.println("Please inter pin = **** ");
            System.out.println("Re - Enter Your Pin");
            pin = sc.nextInt();
            if (pin == 1234) {
                System.out.println("========================================");
                System.out.println("Go to Banking");
                System.out.println("----------------------------------------");
            }
        }
    }

    public void withdrawal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Balance = 15000");
        System.out.println("You elligiable for only 9000");
        System.out.println("----------------------------------------");
        System.out.println("Enter the amount");
        int amount;
        amount = sc.nextInt();
        System.out.println("Your enter amount = " + amount);
        if (amount == 9000) {
            System.out.println("========================================");
            System.out.println("Please collect your cash");
            System.out.println("Your aviliable Balence = "+(15000-amount));
            System.out.println("========================================");
        } else {
            System.out.println("Your are not elligiable for = " + amount);
            System.out.println("Re-enter the amount");
            amount = sc.nextInt();
            if (amount == 9000) {
                System.out.println("========================================");
                System.out.println("Please collect your cash");
                System.out.println("Your aviliable Balance = 6000 ");
                System.out.println("========================================");
            }
        }
    }

    public void ReWithdrawal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You want to Re-Withdrawal - Type y");
        System.out.println("You do not want to continue - Type n");
        System.out.println("****************************************");
        String input = "";
        System.out.println("Please type y or n");
        input = sc.nextLine();
        if (input.equals("y")) {
            System.out.println("========================================");
            System.out.println("Go to Banking Again");
            System.out.println("----------------------------------------");
        }
        if (input.equals("n")) {
            System.out.println("----------------------------------------");
            System.out.println("!!!!!!!!!!!!! Thank You For Visit !!!!!!!!!!!!!");
            System.out.println("----------------------------------------");

            System.exit(0);

        }

    }

    public void withdrawalagain() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Balance = 11000");
        System.out.println("Enter the amount");
        int amount;
        amount = sc.nextInt();
        System.out.println("Your enter amount = " + amount);
        if (amount == 11000) {
            System.out.println("========================================");
            System.out.println("Please collect your cash");
            System.out.println("Your aviliable Balence =  " + (11000 - amount));
            System.out.println("========================================");
        } else {
            System.out.println(" No Efficient Balance ");
            System.out.println("Re-enter the amount");
            amount = sc.nextInt();
            if (amount == 11000) {
                System.out.println("========================================");
                System.out.println("Please collect your cash");
                System.out.println("Your aviliable Balence =  " + (11000 - amount));
                System.out.println("========================================");
            }
        }
    }

    public void ReWithdrawalAgain() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You want to Re-Withdrawal - Type y");
        System.out.println("You do not want to continue - Type n");
        System.out.println("****************************************");
        String input = "";
        System.out.println("Please type y or n");
        input = sc.nextLine();
        if (input.equals("y")) {
            System.out.println("========================================");
            System.out.println("Go to Banking again");
            System.out.println("----------------------------------------");
        }
        if (input.equals("n")) {
            System.out.println("----------------------------------------");
            System.out.println("!!!!!!!!!!!!! Thank You For Visit !!!!!!!!!!!!!");
            System.out.println("----------------------------------------");
            System.exit(0);
        }
    }

    public void withdrawalagainandagain() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Balance = 22000");
        System.out.println("Enter the amount");
        int amount;
        amount = sc.nextInt();
        System.out.println("Your enter amount = " + amount);
        if (amount == 22000) {
            System.out.println("========================================");
            System.out.println("Please collect your cash");
            System.out.println("Your aviliable Balence =  0");
            System.out.println("========================================");
            System.out.println("!!!!!!!!!!!!! Thank You For Visit !!!!!!!!!!!!!");
        } else {
            System.out.println(" No Efficient Balance ");
            System.out.println("Re-enter the amount");
            amount = sc.nextInt();
            if (amount == 11000) {
                System.out.println("========================================");
                System.out.println("Please collect your cash");
                System.out.println("Your aviliable Balence = 0");
                System.out.println("----------------------------------------");
                System.out.println("!!!!!!!!!!!!! Thank You For Visit !!!!!!!!!!!!!");
                System.out.println("----------------------------------------");
            }
        }
    }

}

class MainAtm {
    public static void main(String[] args) {
        Atm A = new Atm();
        A.pinCheck();
        A.withdrawal();
        A.ReWithdrawal();
        A.withdrawalagain();
        A.ReWithdrawalAgain();
        A.withdrawalagainandagain();
    }

}