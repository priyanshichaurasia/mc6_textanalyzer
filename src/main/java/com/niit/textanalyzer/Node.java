package com.niit.textanalyzer;

public class Node {
    // declare the Word object and the recursive reference 'next' that the Node of the linked list holds
    Word word;
    Node next;

    // initialize data value
    public Node(Word word){
        this.word=word;
        next=null;
    }
}
