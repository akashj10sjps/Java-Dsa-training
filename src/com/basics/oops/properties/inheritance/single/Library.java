package com.basics.oops.properties.inheritance.single;

public class Library {
    String name;
    int id;

    public Library(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
class Book extends Library{
    double price;
    public Book(String name,int id,double price) {
        super(name,id);
        this.price = price;
    }
    void display(){
        System.out.println(name+" "+id+" "+price);
    }

    public static void main(String[] args) {
        Book book=new Book("harry potter",20,400);
        book.display();
    }
}