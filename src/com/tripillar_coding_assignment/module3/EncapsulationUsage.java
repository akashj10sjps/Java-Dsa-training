package com.tripillar_coding_assignment.module3;

public class EncapsulationUsage {
    public static void main(String[] args) {
        Encapsulation detail = new Encapsulation();
        detail.setBankBalance(20000);
        detail.setSalary(100000);
        System.out.println(detail.getBankBalance());
        System.out.println(detail.getSalary());
    }
}
