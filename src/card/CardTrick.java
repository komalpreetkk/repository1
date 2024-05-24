/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Komalpreet Kaur (991722201)
 * This class models a hand of seven cards filled with random cards.
 */
package card;
import java.util.Random;
import java.util.Scanner;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
   public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Fill magicHand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1);  // Random value from 1 to 13
            c.setSuit(Card.SUITS[random.nextInt(4)]);  // Random suit index
            magicHand[i] = c;
        }

        // Add a luck card (2 of Clubs)
        Card luckCard = new Card();
        luckCard.setValue(2);
        luckCard.setSuit("Clubs");
        magicHand[magicHand.length - 1] = luckCard;

        // Ask the user for Card value and suit
        System.out.print("Enter Card Value: ");
        int userValue = scanner.nextInt();
        System.out.print("Enter Card Suit (Hearts, Diamonds, Clubs, Spades): ");
        String userSuit = scanner.next();

        // Create user's card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        // Search magicHand for user's card
        boolean found = false;
        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }

        // Report the result
        if (found) {
            System.out.println("Congratulations! Your card was found in the magic hand.");
        } else {
            System.out.println("Sorry! Your card was not found in the magic hand.");
        }

        scanner.close();
    }

}
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    
    

