package game_logic;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class BlackJack {

    private ArrayList<Card> cardDeck  = new ArrayList<>();
    //this is the card deck

    private Card dealerCard;
    private ArrayList<Card> dealerall = new ArrayList<>();
        //dealer's hand


    private int dealerTotal;
    private int dealerAce;
        //dealer's card sum and the number of ace (for soft and hard stay)
        //dealder's data


    private Card playerCard;
    private ArrayList<Card> playerall = new ArrayList<>();
        //player's hand

    private int playerTotal;
    private int playerAce;
        //player's card sum and the number of ace (for soft and hard stay)
        //player's data


    public void deckUp(){
        for (int k = 0; k < 5; k++) {
            for (int i = 2; i < 15; i++) {
                for (int j = 1; j < 5; j++) {
                    Card c = new Card(i, j);
                    cardDeck.add(c);
                }
            }
        }
        // we use a triple loop to go through every number and suit to geenrate card object
        // and then we add it to the card deck
        // 6 decks of card
    }
    //fill up the deck

    public void Shuffler(){
        Random rand = new Random();
        int shuffleTime = rand.nextInt(1,10);
        for (int i = 0; i < shuffleTime; i++){
            Collections.shuffle(cardDeck);
        }
        //shuffle random number of time
    }
    //shuffle the deck

    public boolean Ace(Card c){
        if (c.getValue() == 14){
            return true;
        }
        return false;
    }


    public BlackJack(){

        deckUp();
        Shuffler();

        this.dealerall = new ArrayList<Card>();
        this.dealerTotal = 0;
        this.dealerAce = 0;
        //original start

        {
            dealerCard = cardDeck.removeFirst();
            //dealer get card
            dealerall.add(dealerCard);
            //add to the hand
            dealerTotal += dealerCard.getValue();
            dealerAce += Ace(dealerCard) ? 1 : 0;

            Card dealerCard_second = cardDeck.removeFirst();
            //dealer get another card
            dealerall.add(dealerCard_second);
            //add to the hand
            dealerTotal += dealerCard_second.getValue();
            dealerAce += Ace(dealerCard_second) ? 1 : 0;

            System.out.println(dealerTotal);
            System.out.println(dealerall);


            // dealer_part
        }
        // dealer part

        {
            playerCard = cardDeck.removeFirst();
            //dealer get card
            playerall.add(playerCard);
            //add to the hand
            playerTotal += playerCard.getValue();
            playerAce += Ace(playerCard) ? 1 : 0;

            Card playerCard_second = cardDeck.removeFirst();
            //dealer get another card
            playerall.add(playerCard_second);
            //add to the hand
            playerTotal += playerCard_second.getValue();
            playerAce += Ace(playerCard_second) ? 1 : 0;

            System.out.println(playerTotal);
            System.out.println(playerall);}
        // player part
    }





    public static void main(String []args){
        BlackJack s = new BlackJack();
    }


}
