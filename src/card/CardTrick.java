/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author Steven Mahabir
 * @studentNumber 991490605
 *  test test
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();

        //Generate 7 random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //random value 1 to 13
            c.setValue(random.nextInt(13) + 1);
            //random suit
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = c;
        }

        /*
        //insert code to ask the user for Card value and suit, create their card
        Scanner scanner = new Scanner(System.in);
        Card[] playerCards = new Card[7];
        //allow 7 attempts with for loop
        for (int i = 0; i < 7; i++) {
            System.out.println("Pick card " + (i + 1) + "  from 1 - 13: ");
            int playerValue = scanner.nextInt(); //read player choice
            System.out.println("Pick your suit (Hearts, Diamonds, Clubs, Spades): ");
            String playerSuit = scanner.next(); //read player choice

            //need to create a card object to represent the player card against magic hand
            Card playerCard = new Card();
            playerCard.setValue(playerValue); // set player card value from line 39
            playerCard.setSuit(playerSuit); // set player card suit from line 41
            playerCards[i] = playerCard;
        }

        // and search magicHand here
        for (Card playerCard : playerCards) {
            boolean found = false; //to set the initial to false before searching magic hand
            for (Card card : magicHand) {
                //if magic card is equal to the players card it will result in found = true
                if (card.getValue() == playerCard.getValue() && card.getSuit().equals(playerCard.getSuit())) {
                    found = true;
                    break;
                }
            }
         */
        // add one luckcard hard code 2,clubs
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");

        //Check if lucky card is in the magic hand
        boolean found = false; //to set the initial to false before searching magic hand
        for (Card card : magicHand) {
            //if magic card is equal to the players card it will result in found = true
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit())) {
                found = true;

            }
        }

        //Then report the result here
        if (found) {
            System.out.println("Your card " + luckyCard.getValue() + " of " + luckyCard.getSuit() + " is in the magic hand!");
        } else {
            System.out.println("Sorry! Your card " + luckyCard.getValue() + " of " + luckyCard.getSuit() + " is NOT in the magic hand!");
        }
        System.out.println("Magic hand contains");
        for (Card card : magicHand) {
            System.out.println("Card value: " + card.getValue() + " of " + card.getSuit());
        }
    }
}
