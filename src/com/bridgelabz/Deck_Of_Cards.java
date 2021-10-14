package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Deck_Of_Cards {

        Scanner scanner=new Scanner(System.in);

        ArrayList<String> cards=new ArrayList<>();
        //declare suit
        String[] suit=new String[]{"Clubs","Diamonds","Hearts","Spades"};
        //Declare ranks array
        String[] ranks=new String[]{"2","3","4","5","6","7","8","9","10","Jacks","queen","King","Ace"};

        public void createCards(){
            for(int i=0;i< suit.length;i++) {
                for (int j = 0; j < ranks.length; j++) {
                    cards.add(suit[i]+"->"+ranks[j]);
                }
            }
            display(cards);
        }

        public void display(ArrayList<String> cards){
            for(String card:cards) {
                System.out.println(card);
            }
        }

        public void addPlayer(){
            System.out.println("how many player to add:");
            int noOfPlayer= scanner.nextInt();
            if(noOfPlayer>2 || noOfPlayer<5){
                System.out.println("enter no of player between 2 to 4");
            }
        }
    }

