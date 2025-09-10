package org.first.week1.day6expensetrackerproject;

import java.util.ArrayList;

public class ExpenseTracker {

   private ArrayList<Expense> expenses = new ArrayList<>();

    void addNewExpense(Expense e){
        expenses.add(e);
        System.out.println("Added new expense");
    }
    void getAllExpenses(){
        if(expenses.isEmpty()){
            System.out.println("No expenses recorded");
        }
        else {
            for (Expense e : expenses) {
                System.out.println(expenses.indexOf(e)+" is the index for");
                System.out.println(e.toString());
            }
        }
    }
    void deleteExpense(int index){
        try {
            expenses.remove(index);
            System.out.println("Expense is deleted.");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Index opted is not assigned😕");
        }
    }
    void calculateTotalExpenses(){
        double total = 0;
        for(Expense e :expenses){
            total+=e.getAmount();
        }
        System.out.println("Total expenses: "+ total);
    }
    void getExpensesByCategory(String category){
        if(expenses.isEmpty()){
            System.out.println("No expenses in tracker");
        }
        else{
            int count =0;
            for(Expense e : expenses){
                if(e.getCategory().equalsIgnoreCase(category)){
                    System.out.println(e.toString());
                    count++;
                }
            }
            if(count==0){
                System.out.println("No expenses found by category "+category);
            }
        }
    }

}
