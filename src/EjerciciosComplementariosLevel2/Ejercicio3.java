package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.Collections;


public class Ejercicio3 {
    public static ArrayList<Integer> cardDeck = new ArrayList<Integer>();

    public static void main(String[] args) {
        cardDeckLoader();
        System.out.println(cardDeck);
        cardDeckReverser();
        System.out.println(cardDeck);
        cardDeckShuffler();
        System.out.println(cardDeck);
        cardDeckSorter();
        System.out.println(cardDeck);

    }

    public static void cardDeckLoader(){
        for(int i=2; i <=10; i++ ){
            cardDeck.add(i);
        }
    }
    public static void cardDeckSorter(){
        Collections.sort(cardDeck);
    }

    public static void cardDeckShuffler(){
        Collections.shuffle(cardDeck);

    }
    public static void cardDeckReverser(){
        Collections.reverse(cardDeck);
    }

}
