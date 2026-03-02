package com.basics.oops.properties.polymorphism.overriding;

public class RBI {
    double rateOfInterest(){
        return 6.8;
    }
}
class HDFC extends RBI{
    @Override
    double rateOfInterest(){
        return 7.2;
    }
}
class ICICI extends RBI{
    @Override
    double rateOfInterest(){
        return 7.5;
    }
}
class Canara extends RBI{
    @Override
    double rateOfInterest() {
        return 8.1;
    }

    public static void main(String[] args) {
        // upcasting -> parent obj=new child
        RBI rbi=new RBI();
        RBI hdfc=new HDFC();
        RBI icici=new ICICI();
        RBI canara=new Canara();
        System.out.println("the roi of rbi is :"+rbi.rateOfInterest()+"%");
        System.out.println("the roi of hdfc is :"+hdfc.rateOfInterest()+"%");
        System.out.println("the roi of icici is :"+icici.rateOfInterest()+"%");
        System.out.println("the roi of canara is :"+canara.rateOfInterest()+"%");
    }
}
