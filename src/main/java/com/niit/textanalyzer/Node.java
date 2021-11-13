package com.niit.textanalyzer;

public class Node {
    // declare the Word object and the recursive reference 'next' that the Node of the linked list holds
    String word;
    Node next;

    // initialize data value
    public Node(String word){
        this.word=word;
        next=null;
    }
}
