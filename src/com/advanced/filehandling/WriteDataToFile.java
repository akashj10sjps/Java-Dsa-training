package com.advanced.filehandling;

import java.io.FileWriter;

public class WriteDataToFile {
    public static void main(String[] args) throws Exception{
        FileWriter writer=new FileWriter("./Demo/current_status.txt",true);
        writer.append("\n If we have exam over morrow ,we will study today itself,definitely not before");
        writer.close();
        System.out.println("Successfully wrote data into the file");
    }
}
