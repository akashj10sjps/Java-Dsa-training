package com.basics.oops.properties.inheritance.hierarchical;

public class User {
    void role(){
        System.out.println("Generic user");
    }
}
class Admin extends User{
    @Override
    void role(){
        System.out.println("Admin user");
    }
}
class Guest extends User{
    @Override
    void role(){
        System.out.println("guest user");
    }
}
class Demo{
    public static void main(String[] args) {
        User user=new User();
        user.role();
        User admin=new Admin();
        admin.role();
        User guest=new Guest();
        guest.role();
    }
}