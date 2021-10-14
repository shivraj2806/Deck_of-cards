package com.bridgelabz;

public class Deck_Of_Cards_Main {
    public static void main(String[] args){

        Deck_Of_Cards deck_of_cards=new Deck_Of_Cards();
        System.out.println("Welcome to Deck of cards");
        deck_of_cards.createCards();
        deck_of_cards.addPlayer();
    }
}