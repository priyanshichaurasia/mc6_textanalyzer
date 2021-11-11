package com.niit.textanalyzer;

public class Word {

    // The Word class declare the word and the occurance
    private String word;
    private int occurance;

    public Word() {
    }

    // Declare parameterized constructor and initialize values
    public Word(String word,int occurance)
    {
        this.word=word;
        this.occurance=occurance;
    }
    // getters and setters
    public void setWord(String word){
        this.word=word;
    }
    public String getWord(){
        return word;
    }
    public void setOccurance(int occurance){
        this.occurance=occurance;
    }
    public int getOccurance(){
        return occurance;
    }

    // Override the toString() method in this format Word={word=xxx,wordOccurance=x}
        @Override
        public String toString() {
            return ("{words="+getWord() +",wordOccurance="+getOccurance()+"}");
        }
}
