package org.first.week1;

class Calc{

    public int add2Numbers(int a,int b){
        return a+b;
    }

    public double add2Numbers(double a, double b){
        return a+b;
    }
}

class Animal{
    void isMakingSound(){
        System.out.println("animal makes sound");
    }
}
class Dog extends Animal{
    void isMakingSound(){
        System.out.println("Dog makes barking sound");
    }
}
class Cat extends Animal{
    void isMakingSound(){
        System.out.println("Cat makes meowing sound");
    }
}

abstract class Vehicle {
    void model(){};
    void runsBy(){
        System.out.println("either by diesel or petrol");
    }
}
class Bike extends Vehicle {
    @Override
    void model() {
        System.out.println("Model is of 2020");
    }
    void runsBy(){
        System.out.println("runs by petrol");
    }
}

interface Payment{
    void paymentIsOf();
    void done();
}
interface UpiPayment extends Payment{
    void upiPayment();
}
class SuccessPayment implements Payment{

    private String paymentof;
    private String done;
    SuccessPayment(String paymentof, String done){
        this.paymentof = paymentof;
        this.done = done;
    }

    public void paymentIsOf() {
        System.out.println("the payment is of "+paymentof);
    }
    public void done() {
        System.out.println("payment is "+done);
    }
}
class FailurePayment implements Payment{

    private String paymentof;
    private String notDone;
    FailurePayment(String paymentof, String notDone){
        this.paymentof = paymentof;
        this.notDone = notDone;
    }

    public void paymentIsOf() {
        System.out.println("the payment is of "+paymentof);
    }
    public void done() {
        System.out.println("payment is "+notDone);
    }
}
class EitherPaymentInUpi implements UpiPayment{

    String upiPayment;
    String paymentIsOf;
    String done;
    EitherPaymentInUpi(String upiPayment, String paymentIsOf,String done){
        this.upiPayment = upiPayment;
        this.paymentIsOf = paymentIsOf;
        this.done = done;
    }

    public void upiPayment() {
        System.out.println("the payment is from "+upiPayment);
    }
    public void paymentIsOf() {
        System.out.println("the payment is of "+paymentIsOf);
    }
    public void done() {
        System.out.println("the status of payment is "+done);
    }
}

public class Day2 {
    public static void main(String[] args){

//        Calc c1 = new Calc();
//        System.out.println(c1.add2Numbers(1,2));
//        System.out.println(c1.add2Numbers(1.2,2.2));
//
//        Animal a1 = new Animal();
//        a1.isMakingSound();
//        Animal a2 = new Dog();
//        a2.isMakingSound();
//        Animal a3 = new Cat();
//        a3.isMakingSound();
//        Vehicle v1 = new Bike();
//        v1.model();
//        v1.runsBy();

//        Payment sp1 = new SuccessPayment("100.12","Done");
//        sp1.paymentIsOf();
//        sp1.done();
//
//        FailurePayment fp1 = new FailurePayment("201.90","Not done");
//        fp1.paymentIsOf();
//        fp1.done();

        UpiPayment upi1 = new EitherPaymentInUpi(" UPI","126.98","its done");
        upi1.upiPayment();
        upi1.paymentIsOf();
        upi1.done();
    }
}
