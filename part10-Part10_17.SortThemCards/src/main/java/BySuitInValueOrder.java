/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card>{
    
    public int compare(Card a, Card b) {
        if (a.getSuit().ordinal() != b.getSuit().ordinal()) {
            return a.getSuit().ordinal() - b.getSuit().ordinal();
        }
        return a.getValue() - b.getValue();
    }
    
}
