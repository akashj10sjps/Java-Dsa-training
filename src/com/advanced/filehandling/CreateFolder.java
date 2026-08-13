package com.advanced.filehandling;

import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
        //Operating system -two types of paths
        //1. Absolute path -root directory
        // 2. relative path-current directory
        File folder = new File("C:\\Users\\Admin\\Documents\\SNPSU_B1_ECE\\Demo\\DSA");
        if(folder.mkdir()){
            System.out.println("Folder "+folder.getName()+ " Created");
        }else{
            System.out.println("Folder already exists.");
        }
    }
}
