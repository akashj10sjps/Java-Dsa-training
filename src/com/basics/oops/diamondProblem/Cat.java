package com.basics.oops.diamondProblem;

public interface Cat {

    default void sound(){
        System.out.println("Meow");
    }
}
interface Dog{
    default void sound(){
        System.out.println("bow");
    }
}
class Cog implements Cat,Dog{
    @Override
    public void sound() {
        //System.out.println("some new sound");
        Cat.super.sound();
        Dog.super.sound();
    }
}
class Demo{
    public static void main(String[] args) {
        Cog cog=new Cog();
        cog.sound();
    }
}
