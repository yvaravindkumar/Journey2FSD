package org.first.week1;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}

//develop this afterwards
class AccountDB{
    ArrayList<BankAccount> registrar = new ArrayList<>();
    String addCustomer(BankAccount ba){
        registrar.add(ba);
        return "customer added";
    }
    String deleteCustomer(BankAccount ba){
        registrar.remove(ba);
        return "customer removed";
    }
    String updateCustomer(BankAccount ba){
//        registrar.set();
        return "customer updated";
    }

}
class BankAccount {
    private Long accNum;
    private String custName;
    private double accntBalance=0;
    private String lastTxn = String.valueOf(String.valueOf(LocalDateTime.now()));

    BankAccount(){};
    BankAccount(Long accNum,String custName){
        this.accNum=accNum;
        this.custName=custName;
    }
    double addBalance(double tobeadded){
        this.accntBalance = this.accntBalance +tobeadded;
        this.lastTxn = String.valueOf(String.valueOf(LocalDateTime.now()));
        return getAccntBalance();
    }
    double getAccntBalance(){
        return this.accntBalance;
    }
    String withdrawbalance(double tobewithdrawn) throws InsufficientFundsException{
            if(tobewithdrawn>this.accntBalance){
                throw new InsufficientFundsException("you have insufficient amount to wihdraw. \n Balance: "+this.accntBalance+"");
            }
            else{
                this.accntBalance = this.accntBalance-tobewithdrawn;
                this.lastTxn = String.valueOf(String.valueOf(LocalDateTime.now()));
            }
            return "Amount withdrawn:"+tobewithdrawn+"\nBalance: "+getAccntBalance();
    }
    String getBankAccountDetails(){
        return "Account Number:"+this.accNum+
                "\n Customer Name:"+this.custName+
                "\n Account Balance:"+getAccntBalance()+
                "\n last Transaction: "+this.lastTxn;
    }

}
public class Day4 {
    public static void main(String[] args){
//        int a = 0;
        //try - catch - finally
//        try{
//            int b = 1203/a;
//            System.out.println("the result is "+b);
//        } catch (ArithmeticException e) {
//            System.out.println("the calculation cannot be completed as divisor is 0");
//            System.out.println(Arrays.toString(e.getStackTrace()));
//        }
//        finally{
//            System.out.println("calculation is done");
//        }

        //checked exception
//        try{
//            File f1 = new File("lexus.txt");
//            Scanner sc = new Scanner(f1);
//            System.out.println(sc);
//        }
//        catch(FileNotFoundException e){
//            System.out.println("file is not found or file name is incorrect");
//            System.out.println(e.getMessage());
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of candidates: ");
//        int cands = sc.nextInt();
//        for (int i=0;i<cands;i++){
//            System.out.println("enter age of candidate: ");
//            int age = sc.nextInt();
//            try{
//                checkAgeLimit(age);
//            }
//            catch (InvalidAgeException e){
//                System.out.println(e.getMessage());
//            }
//        }
        BankAccount acc1 = new BankAccount(1232L,"jinha");
        System.out.println("Balance now is: "+acc1.addBalance(12));
        System.out.println("Details: \n"+acc1.getBankAccountDetails());
        System.out.println("Balance now is: "+acc1.addBalance(8765));
        try{
            System.out.println("Balance now is: "+acc1.withdrawbalance(67));
        }
        catch(InsufficientFundsException e){
            System.out.println("faced an error "+e.getMessage());
        }
        finally {
            System.out.println("Transaction completed");
        }
        System.out.println(acc1.getAccntBalance());
        System.out.println("Balance now is: "+acc1.addBalance(9));
        System.out.println("Details: \n"+acc1.getBankAccountDetails());

    }

    static void checkAgeLimit(int age) throws InvalidAgeException{
        if(age<35){
            throw new InvalidAgeException("candidate of age "+age +" is not valid");
        }
        else{
            System.out.println("Candidate is eligible as age is "+age);
        }
    }
}
