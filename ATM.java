package exp1;
	import java.util.Scanner;
	public class ATM {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int balance = 10000;
	        int choice;
	        do {
	            System.out.println("\n--- ATM Menu ---");
	            System.out.println("1. Check Account Balance");
	            System.out.println("2. Deposit Money");
	            System.out.println("3. Withdraw Money");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                    System.out.println("Your account balance is ₹" + balance);
	                    break;
	                case 2:
	                    System.out.print("Enter amount to deposit: ₹");
	                    int deposit = sc.nextInt();
	                    balance += deposit;
	                    System.out.println("Amount deposited successfully.");
	                    break;
	                case 3:
	                    System.out.print("Enter amount to withdraw: ₹");
	                    int withdraw = sc.nextInt();
	                    if (withdraw <= balance) {
	                        balance -= withdraw;
	                        System.out.println("Amount withdrawn successfully.");
	                    } else {
	                        System.out.println("Insufficient balance.");
	                    }
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the ATM. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice, please try again."); }
	        } while (choice != 4);
	        sc.close();
	    }
	}