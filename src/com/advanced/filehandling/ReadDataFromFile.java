package com.advanced.filehandling;

import java.io.File;
import java.util.Scanner;

public class ReadDataFromFile {
    public static void main(String[] args) throws Exception{
        File file=new File("./Demo/current_status.txt");
        Scanner reader=new Scanner(file);
        while(reader.hasNextLine()){
            //everything in a textfile is String only
            String data=reader.nextLine();
            System.out.println(data);
        }
        reader.close();
    }
}
