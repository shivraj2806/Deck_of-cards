package com.bridgelabz;

import java.util.ArrayList;

public class Deck_Of_Cards {

    public ArrayList<String> cardDeck = new ArrayList<>();

    public void deckOfCard() {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int numOfCards = suits.length * ranks.length;
        System.out.println("number of cards of " + numOfCards);
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                cardDeck.add( ranks [i] + "----" + suits[j]);
            }
        }
        toPrint(cardDeck);
    }
    public static void toPrint(ArrayList<String> cardDeck){
        System.out.println("cards in Deck:");
        for (String element : cardDeck){
            System.out.println(element);
        }
        System.out.println();
    }
}

