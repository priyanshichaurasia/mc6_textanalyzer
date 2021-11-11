package com.niit.textanalyzer;

public class LinkedList {

    Node startPtr;
    // This method adds a Word node to the linked list
    public boolean addNode(String item) {
        Node n = new Node(item);

        return false;
    }

    // This method checks if a given word occurs in the linked list and returns true of false
    public boolean updateOccurance(String item) {
        if()
        return false;
    }

    // This method checks if the list is empty or not
    public boolean isEmpty(){
        if(startPtr==null){
            return getSize() == 0;
        }
        else{
            return getSize()==1;
        }
        
    }

    // This method returns the size of the linked list
    public int getSize()
    {

        return -1;
    }

    // This method displays words in descending order of their occurances
    public void showFrequentWords() {
    }
    //This method displays the word list
    public void showWordList(){
    }

}
