package game_logic;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;



public class Card {

    private int value;
    //this is for the card value
    private int color;
    //this is for separating the suits (1: heart, 2: spades, 3: clubs, 4:diamonds)


    public Card(int value, int color){
        this.value = value;
        this.color = color;
    }
    // Basic constructor


    public String toString(){
        //for printing purpose
        Dictionary<Integer, String> suitMap = new Hashtable<>();
        suitMap.put(1,"Heart");
        suitMap.put(2,"Spades");
        suitMap.put(3,"Clubs");
        suitMap.put(4,"Diamonds");

        return suitMap.get(this.color) + " of " + this.value;
    }

    public int getValue(){
        return this.value;
    }



    public static void main(String []args){
        Card s = new Card(1,1);
        System.out.println(s.toString());
    }

}
