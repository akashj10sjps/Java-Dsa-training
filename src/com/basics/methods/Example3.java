package com.basics.methods;

public class Example3 {
    public static void main(String[] args) {
        System.out.println(tsa_cube(5)+"sq units");
        System.out.println(tsa_cuboid(6,7,8)+"sq units");
        System.out.println(tsa_cylinder(7,5)+"sq units");
    }
    static double tsa_cube(int l){
        return 6*l*l;
    }
    static double tsa_cuboid(int l,int b,int h){
        return 2*(l*b+b*h+l*h);
    }
    static double tsa_cylinder(int r,int h){
        return 2*Math.PI*r*(r+h);
    }

}
