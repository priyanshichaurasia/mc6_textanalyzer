package com.niit.textanalyzer;

public class LinkedList {

    Node startPtr;
    Node end;
    // This method adds a Word node to the linked list
    public boolean addNode(String item) {
        
        Node n = new Node(item);
        if(getSize()==0){
            startPtr=n;
            return false;
        }
        else if(updateOccurance(item)){
            Word w1 = new Word();
            int count = w1.occuranceCount();
        }
        else{
            Node temp = startPtr;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
        return true;
    }

    // This method checks if a given word occurs in the linked list and returns true of false
    public boolean updateOccurance(String item) {
        Node temp=startPtr;
        while(temp!=null){
            if(temp.equals(item)){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    // This method checks if the list is empty or not
    public boolean isEmpty(){
        if(startPtr==null){
            return true;
        }
        else{
            return false;
        }
        
    }

    // This method returns the size of the linked list
    public int getSize()
    {
        int count=0;
        Node temp = startPtr;    
            
        while(temp!=null) {    
            count=count+1;
            temp = temp.next;    
        }    
        return count;
    }

    // This method displays words in descending order of their occurances
    public void showFrequentWords() {
        
    }
    //This method displays the word list
    public void showWordList(){
        Node temp;
        if(startPtr!=null){
            temp = startPtr;
            while(temp!=null){
                System.out.println(temp.word);
                temp=temp.next;
            }
        }
    }

}
