package org.first.week1.day6expensetrackerproject;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExpenseTracker et = new ExpenseTracker();
        try {
            while (true) {
                System.out.println("We are looking into expense Tracker!!!");
                System.out.println("Select an option for action from below::");
                System.out.println("1 => Add new Expense");
                System.out.println("2 => List all Expenses");
                System.out.println("3 => Delete Expense");
                System.out.println("4 => Calculate total Expenses");
                System.out.println("5 => Get Expenses by Category");
                System.out.println("0 => Exit process");
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1: {
                        System.out.println("Adding a new expense...");
                        System.out.println("Enter Amount of expense: ");
                        double amount = Double.parseDouble(sc.nextLine());
                        System.out.println("Enter Category of Expense: ");
                        String category = sc.nextLine();
                        System.out.println("Enter Description of Expense: ");
                        String description = sc.nextLine();
                        LocalDate date = LocalDate.now();

                        et.addNewExpense(new Expense(amount, category, description, date));
                        System.out.println("New Expense added successfully!!!");
                        break;
                    }
                    case 2: {
                        System.out.println("Listing All Expenses...");
                        et.getAllExpenses();
                        System.out.println("that's all for now!!!");
                        break;
                    }
                    case 3: {
                        System.out.println("Deleting expense...select index of expense to be deleted from below");
                        et.getAllExpenses();
                        int index = Integer.parseInt(sc.nextLine());
                        et.deleteExpense(index);
                        System.out.println("Expense deleted successfully!!!");
                        break;
                    }
                    case 4: {
                        System.out.println("Calculating total expenses");
                        et.calculateTotalExpenses();
                        System.out.println("Thats the total!!");
                        break;
                    }
                    case 5: {
                        System.out.println("We are looking expenses by category..");
                        System.out.println("Enter category to search for: ");
                        String category = sc.nextLine();
                        et.getExpensesByCategory(category);
                        break;
                    }
                    case 0: {
                        System.out.println("Exiting expense tracker...");
                        return;
                    }
                    default: {
                        System.out.println("Incorrect option selected");
                    }
                }

            }
        }
        catch(NumberFormatException e){
            throw new NumberFormatException("Not the expected option format");
        }
    }
}
