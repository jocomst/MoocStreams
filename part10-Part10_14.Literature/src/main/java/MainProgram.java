
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> list = new ArrayList<>();
        
        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String name = scanner.nextLine();
            if (name.isEmpty()) break;
            System.out.println("Input the age recommendation");
            int age = Integer.valueOf(scanner.nextLine());
            list.add(new Book(name, age));
        }
        
        System.out.println(list.size() + " books in total.");
        System.out.println("Books:");
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        
        Collections.sort(list, comparator);
        
        for (Book b : list) {
            System.out.println(b.getName() + " (recommended for " + b.getAge() + " year-olds or older)");
        }
    }

}
