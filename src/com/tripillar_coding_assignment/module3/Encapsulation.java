package com.tripillar_coding_assignment.module3;

public class Encapsulation {
    private int bankBalance;
    private int Salary;
    //Setter
    public void setBankBalance(int bankBalance){
        this.bankBalance=bankBalance;
    }
    public void setSalary(int Salary){
        this.Salary=Salary;
    }
    //Getter
    public int getBankBalance(){
        return this.bankBalance;
    }
    public int getSalary(){
        return this.Salary;
    }

}
