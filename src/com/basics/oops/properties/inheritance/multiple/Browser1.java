package com.basics.oops.properties.inheritance.multiple;

public interface Browser1 {
    void browser1();
}
interface Browser2{
    void browser2();
}
interface Browser3{
    void browser3();
}
class Browsers implements Browser1,Browser2,Browser3 {

    @Override
    public void browser1() {
        System.out.println("google chrome");
    }

    @Override
    public void browser2() {
        System.out.println("firefox");
    }


    @Override
    public void browser3() {
        System.out.println("safari");
    }

    public static void main(String[] args) {
        Browsers browser=new Browsers();
        browser.browser1();
        browser.browser2();
        browser.browser3();
    }
}
