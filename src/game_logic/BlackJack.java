package game_logic;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class BlackJack {

    private ArrayList<Card> cardDeck  = new ArrayList<>();
    //this is the card deck    //get the deck

    public void deckUp(){
        for (int i = 1; i < 13; i++){
            for (int j = 1; j < 5; j++){
                Card c = new Card(i,j);
                cardDeck.add(c);
            }
        }
        // we use a double loop to go through every number and suit to geenrate card object
        // and then we add it to the card deck
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

    public BlackJack(){
    }


    public static void main(String []args){
        BlackJack s = new BlackJack();
        s.deckUp();
        s.Shuffler();
        System.out.println(s.cardDeck);
    }


}
