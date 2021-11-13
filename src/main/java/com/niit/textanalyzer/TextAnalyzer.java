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
            String [] output = line.split("[,.;:[\\s]]"); 
            for(int i=0;i<output.length;i++){
                linkedList.addNode(output[i]);
            }
            line=br.readLine();
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        return linkedList;
    }

}
