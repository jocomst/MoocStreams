
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Employees {
    private ArrayList<Person> list;
    
    public Employees() {
        this.list = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.list.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iterator = peopleToAdd.iterator();
        
        while(iterator.hasNext()) {
            this.list.add(iterator.next());
        }
    }
    
    public void print() {
        Iterator<Person> iterator = this.list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = this.list.iterator();
        while(iterator.hasNext()) {
            Person p = iterator.next();
            if (p.getEducation().equals(education)) {
                System.out.println(p);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = this.list.iterator();
        
        while(iterator.hasNext()) {
            Person p = iterator.next();
            if (p.getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
