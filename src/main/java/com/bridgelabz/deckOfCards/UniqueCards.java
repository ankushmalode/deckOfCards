package com.bridgelabz.deckOfCards;

public class UniqueCards {
    /**
     * @variable declaration
     */
    static String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    static String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    static String[] deck=new String[52];

    /**
     * Generating random card
     */
    static void distribute() {
        int count=0;
        for (String s : suit) {
            for (String value : rank) {
                deck[count] = s + value + " ";
                count++;
            }
        }
    }

    public static void display(){
        System.out.print("\nDeck Of Cards: ");
        for (String s : deck)
            System.out.print(s);
    }
}
