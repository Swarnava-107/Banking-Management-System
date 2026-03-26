package app;

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
            System.out.println("Kindly choose your preferences : " );
            int choice = input.nextInt();
            switch (choice) {
                case 0 -> run = false;

            }
        }

//        switch (choice) {
//            case 1 -> System.out.println("Opening account is in process.");
//            case 2 -> System.out.println("Put amount to deposit");
//            case 3 -> System.out.println("Deposit is in process.");
//            case 4 -> System.out.println("Deposit is in process.");
//            case 5 -> System.out.println("Deposit is in process.");
//        }


    }
}
