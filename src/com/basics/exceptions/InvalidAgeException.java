package com.basics.exceptions;

public class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}
class Main{
    static void vote(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("age must be greater than 18");
        }
        System.out.println("you can vote!");
    }

    public static void main(String[] args) {
        try {
            vote(12);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
//fully Qualified class name -name of the class along with the folders