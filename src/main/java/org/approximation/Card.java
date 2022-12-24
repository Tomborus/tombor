package org.approximation;

public class Card {

    Suit suit;
    Figure figure;

     public Card(Suit mySuit, Figure myFigure) {
       suit = mySuit;
       figure = myFigure;
    }

    public Suit getSuit() {
        return suit;
    }

    public Figure getFigure() {
        return figure;
    }
}





