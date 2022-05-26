
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;
    
    public Hand() {
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        Iterator<Card> iterator = this.hand.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
    }
    
    public void sort() {
        Collections.sort(this.hand);
    }
    
    public ArrayList<Card> getHand() {
        return this.hand;
    }
    
    public void sortBySuit() {
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
    
    public int compareTo(Hand hand) {
        int sum = this.getHand().stream()
                .map(m -> m.getValue())
                .mapToInt(Integer::intValue)
                .sum();
        
        int otherSum = hand.getHand().stream()
                .map(m -> m.getValue())
                .mapToInt(Integer::intValue)
                .sum();
        
        return sum - otherSum;
    }
            
}
