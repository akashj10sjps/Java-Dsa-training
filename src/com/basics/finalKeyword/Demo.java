package com.basics.finalKeyword;

public final class Demo {

}
//cannot extend a final class
//class A extends Demo{
//
//}
class A{
    final void show(){
        System.out.println("show some data");
    }
}
class B extends A{
    //overriding is not possible
//    @Override
//    void show(){
//        System.out.println("show some different data");
//    }
}
class C{
    final int x=200;
    //x=3;cannot assign value to a final variable
    void display(final int x){
       // x=10;cannot assign a value to final parameter 'x'
    }
}

