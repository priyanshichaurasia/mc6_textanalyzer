package com.niit.textanalyzer;

import java.io.*;

public class TextAnalyzer {

// This method reads a file and inserts the file data into the linked list
    public LinkedList readAndParseFile(String filePath) {

        LinkedList linkedList = new LinkedList();
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();
            while(line!=null){
            String[] separator = new String []{"," , " " , "-"};
            String [] output = line.split(String.valueOf(separator));
            Word l1 = new Word(output[0],Integer.parseInt(output[1]));
            linkedList.addNode(output[0]);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        return linkedList;
    }

}
