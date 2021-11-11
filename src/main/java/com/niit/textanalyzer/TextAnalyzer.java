package com.niit.textanalyzer;

import java.io.*;

public class TextAnalyzer {

// This method reads a file and inserts the file data into the linked list
    public LinkedList readAndParseFile(String filePath) {

        LinkedList linkedList = new LinkedList();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line = br.readLine();
        int i=0;
        while(line!=null){
        String[] separator = new String []{"," , " " , "-"};
        String [] output = line.split(separator);
        linkedList.getWord() = output[0];
        linkedList.getOccurance() = Integer.parseInt(output[1]);
        List l1 = new List(linkedList.getWord(),linkedList.getOccurance());
        // linkedList.addNode(l1);
        i=i++;

        return linkedList;
    }

}
