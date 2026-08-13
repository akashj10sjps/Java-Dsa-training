package com.advanced.filehandling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        String[] filenames={"java.txt","python.txt"};
        String path="./Demo/";
        for(int i = 0; i < filenames.length; i++) {
            File file=new File(path + filenames[i]);
            if(file.delete()){
                System.out.println("Deleted "+file.getName());
            }else {
                System.out.println("Failed to delete the file");
            }
        }
    }
}
