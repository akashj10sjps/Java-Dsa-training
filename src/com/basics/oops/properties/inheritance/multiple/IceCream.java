package com.basics.oops.properties.inheritance.multiple;

public interface IceCream{
    String IceCream();
}
interface IceCream2{
    String IceCream2();
}
interface IceCream3{
    String IceCream3();
}
class IceCreams implements IceCream,IceCream2,IceCream3{


    public static void main(String[] args) {
        IceCreams iceCreams=new IceCreams();
        System.out.println(iceCreams.IceCream());
        System.out.println(iceCreams.IceCream2());
        System.out.println(iceCreams.IceCream3());
    }

    @Override
    public String IceCream() {
        return "erson 1 likes ButterScotch";
    }

    @Override
    public String IceCream2() {
        return "person 2 likes Vanilla";
    }

    @Override
    public String IceCream3() {
        return "person 3 likes Blueberry";
    }
}