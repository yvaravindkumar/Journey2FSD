package org.first.week1;

class myCar1{
    String model;
    int year;
    String color;
    float mileage;
    myCar1(){}
    myCar1(String model,int year,String color,float mileage){
        this.model=model;
        this.year=year;
        this.color=color;
        this.mileage=mileage;
    }
    void isDriving(){
        System.out.println(model + "of color "+color + " of year" + year
                +" with mileage of "+mileage + "is going there");
    }

}
class truck extends myCar1{
    void isDriving(){
        System.out.println("truck is being towed");
    }
}
public class Day1 {
    public static void main(String[] args){
        myCar1 mc1 = new myCar1("nimishu",2000,"yellow",23.12f);
        mc1.isDriving();
        myCar1 mc2 = new truck();
        mc2.isDriving();
    }
}
