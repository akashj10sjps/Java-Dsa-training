package com.advanced.filehandling;

import java.io.File;

public class CreateFolderWithSubFolders {
    public static void main(String[] args) {
        //Operating system -two types of paths
        //1. Absolute path -root directory
        // 2. relative path-current directory
        File folder = new File("C:\\Users\\Admin\\Documents\\SNPSU_B1_ECE\\Demo\\F1\\F2\\F3\\F4\\F5");
        if(folder.mkdirs()){
            System.out.println("Folder "+folder.getName()+ " Created");
        }else{
            System.out.println("Folder already exists.");
        }
    }
}
