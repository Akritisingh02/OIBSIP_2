import java.util.Scanner;

public class Task3 {
    private static Scanner in ;
    private static float balance = 0; //initial balance to 0 for everyone
    private static int anotherTransaction;

    public static void main(String[] args) {
        in = new Scanner(System.in);

        //call our transaction method here
        transaction();
    }

    private static void transaction() {
        //here is where most of the work is

        int choice;

        System.out.println("Please select an option");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Balance");

        choice = in.nextInt();
        
        switch (choice) {
            case 1:
                float amount;
                System.out.println("Please enter amount to withdraw: ");
                amount = in.nextFloat();
                if (amount > balance || amount ==0) {
                    System.out.println("You have insufficient funds\n\n");
                    anotherTransaction();  

                }
                else {
                    balance = balance - amount;
                    System.out.println("you have withdraw " + amount + " and your new balance is " + balance);
                    anotherTransaction();

                }
             
                break;
            case 2:
                //option number 2
                float deposit;
                System.out.println("Please enter amount you would wish to deposit: ");
                deposit = in.nextFloat();
                balance = deposit + balance;
                System.out.println("You have deposited " + deposit +" new balance is " + balance + "\n");
                anotherTransaction();
                break;
            case 3:
                //to check balance
                System.out.println("Your balance is "+ balance + "\n");
                anotherTransaction();
                break;
            default:
                System.out.println("Invalid option:\n\n");
                anotherTransaction();
                break;

        }   

    }

    private static void anotherTransaction() {
        System.out.println("Do you want another transaction?\n\nPress 1 for another transaction\n 2 To execute another transaction ");
        anotherTransaction = in.nextInt();
        if (anotherTransaction == 1) {
            transaction();
        }
        else if (anotherTransaction == 2) {
            System.out.println("thanks for choosing us. Good Bye!");

        }
        else {
            System.out.println("Invalid choice\n\n");
            anotherTransaction();
        }
    }

    
}
