package app;

import domain.Type;
import service.BankService;
import service.impl.BankServiceImpl;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Console Bank");
        boolean run = true;
        while(run){
            System.out.println("""
                1. Open Account
                2. Deposit Balance
                3. Withdraw Balance
                4. Transfer Balance
                5. Account Statement
                6. List of Accounts
                7. Search Accounts by Customer Name
                0. Exit
                """);
            Scanner input = new Scanner(System.in);
            BankService bankService = new BankServiceImpl();
            System.out.println("Kindly choose your preferences : " );
            String choice = input.nextLine().trim();
            switch (choice) {
                case "1" -> openAccount(input,bankService);
                case "2" -> deposit(input,bankService);
                case "3" -> withdraw(input);
                case "4" -> transfer(input);
                case "5" -> accountStatement(input);
                case "6" -> listOfAccounts(input,bankService);
                case "7" -> searchAccounts(input);
                case "0" -> run = false;

            }
        }

    }


    private static void openAccount(Scanner input, BankService bankService) {
        System.out.println("Enter Your Name : ");
        String name = input.nextLine().trim();
        System.out.println("Enter Your Email : ");
        String email = input.nextLine().trim();
        System.out.println("Enter account type (SAVINGS/CURRENT): ");
        String type = input.nextLine().trim();
        System.out.println("Initial deposit(optional, blank for 0): ");
        double initialDeposit = input.nextDouble();
        String accountNumber = bankService.openAccount(name,email,type);
        if (initialDeposit > 0){
            bankService.deposit(accountNumber, initialDeposit, "Initial deposit");
        }
        System.out.println("Account "+ accountNumber+" opened successfully");
    }

    private static void deposit(Scanner input,BankService bankService) {
        System.out.println("Enter account number : ");
        String accountNumber = input.nextLine().trim();
        System.out.println("Enter amount to deposit : ");
        Double amount = input.nextDouble();
        bankService.deposit(accountNumber,amount,"Deposited");
        System.out.println("Amount deposited successfully");
    }

    private static void withdraw(Scanner input) {
    }

    private static void transfer(Scanner input) {
    }

    private static void accountStatement(Scanner input) {
    }

    private static void listOfAccounts(Scanner input, BankService bankService) {
        bankService.listOfAccounts().forEach(a -> {
            System.out.println(a.getAccountNumber() + " | "+ a.getAccountType()+" | "+a.getBalance());
        });
    }

    private static void searchAccounts(Scanner input) {
    }


}
