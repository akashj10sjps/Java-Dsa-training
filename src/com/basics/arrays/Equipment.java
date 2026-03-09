package com.basics.arrays;

public class Equipment {
    String name;
    int equipmentId;
    String lab;
    double voltage;
    boolean isWorking;

    public Equipment(String name, int equipment, String lab, double voltage, boolean isWorking) {
        this.name = name;
        this.equipmentId = equipment;
        this.lab = lab;
        this.voltage = voltage;
        this.isWorking = isWorking;
    }
}
class Equip{
    public static void main(String[] args) {
        Equipment[] equipments=new Equipment[]{
                new Equipment("Multimeter",20,"Electronics",220.0,true)
        };
        for(Equipment i:equipments){
            System.out.println(i.name+" "+i.equipmentId +" "+i.lab+" "+i.voltage+" "+i.isWorking);
        }
    }
}
