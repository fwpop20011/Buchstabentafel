package org.com;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Buchstabentafel buchstabentafel = new Buchstabentafel();


        //System.out.println(buchstabentafel.getListOfWords().getFirst());

        Buchstabentafel.Letter letter = Buchstabentafel.Letter.A;
        System.out.println(letter);            // Output: A
        System.out.println(letter.getValue()); // Output: 1
        System.out.println(letter.getWord());  // Output: albert
    }
    /*
    g wie gustav
    v wie viktor
    u wie ulrich
    4
    ulrich
    richard
     */
}