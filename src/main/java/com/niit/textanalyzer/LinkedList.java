package com.niit.textanalyzer;

public class LinkedList {

    Node startPtr;
    Node end;
    // This method adds a Word node to the linked list
    public boolean addNode(String item) {
        boolean ans=false;
        Node n = new Node(word);
        if(getSize()==0){
            startPtr=n;
        }
        else if(updateOccurance(item)==true){
            int count= count+1;
          
        }
        else{
            Node temp = startPtr;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
            return ans = true;
        }

        return false;
    }

    // This method checks if a given word occurs in the linked list and returns true of false
    public boolean updateOccurance(String item) {
        if(startPtr.item.equals(word)){
            return true;
        }
        else{
        return false;
        }
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
        int count = 0;
        Node temp = startPtr;    
            
        while(temp!=null) {    
            count++;    
            temp = temp.next;    
        }    
        return count; 
    }

    // This method displays words in descending order of their occurances
    public void showFrequentWords() {
    }
    //This method displays the word list
    public void showWordList(){
    }

}
