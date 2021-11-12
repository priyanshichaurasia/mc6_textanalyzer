package com.niit.textanalyzer;

public class Node {
    // declare the Word object and the recursive reference 'next' that the Node of the linked list holds
    Word data;
    Node next;

    // initialize data value
    public Node(Word data){
        this.data=data;
        next=null;
    }
}
