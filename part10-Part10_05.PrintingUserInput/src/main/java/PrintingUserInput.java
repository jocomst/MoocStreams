
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) break;
            list.add(input);
        }
        
        list.stream()
                .forEach(m -> System.out.println(m));
    }
}
