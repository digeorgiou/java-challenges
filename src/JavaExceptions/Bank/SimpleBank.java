package JavaExceptions.Bank;

import java.util.Scanner;

public class SimpleBank {

    static double balance = 500;

    public static void main(String[] args) {
        int choice;

        while(true){
            try{
                while (true) {
                    try {
                        printMenu();
                        choice = getChoice();
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Try again");
                    }
                }
                switch(choice) {
                    case 1:
                        deposit(50);
                        break;
                    case 2:
                        deposit(100);
                        break;
                    case 3:
                        System.out.println("Current Balance: " + balance);
                        break;
                    case 4:
                        withdraw(100);
                        break;
                    case 5:
                        System.out.println("Thank you for using BankApp");
                        System.out.println("Goodbye");
                        return;
                    default:
                        System.out.println("Invalid option. Please choose again");
                }
            }catch(IllegalArgumentException e){
                System.err.println(e.getMessage());
                System.out.println("Try again");
            }
        }

    }

    static void printMenu(){
        System.out.println("-----Bank Menu------");
        System.out.println("1. Deposit 50$");
        System.out.println("2. Deposit 100$");
        System.out.println("3. Check Balance");
        System.out.println("4. Withdraw 100$");
        System.out.println("5. Exit");
        System.out.println("Please choose : ");
    }

    static void withdraw(double amount){
        try{
            if(amount > balance || amount < 0){
                throw new IllegalArgumentException("Invalid Withdraw Amount");
            }
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);    // log
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
            throw e;
        }
    }

    static void deposit(double amount){
        try{
            if(amount < 0){
                throw new IllegalArgumentException("Invalid deposit amount");
            }
            balance += amount;
            System.out.println("Successfully deposited: " + amount);    // log
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
            throw e;
        }
    }

    static int getChoice() throws IllegalArgumentException{
        Scanner sc = new Scanner(System.in);
        while(!sc.hasNextInt()){
            System.out.println("Choice must be an Integer");
            sc.nextLine();
        }
        int choice = sc.nextInt();
        sc.nextLine();
        try {
            if (choice < 1 || choice > 5) {
                throw new IllegalArgumentException("Choice must be between 1 and 5");
            }
            return choice;
        } catch (IllegalArgumentException e) {
            throw e;
        }

    }
}
