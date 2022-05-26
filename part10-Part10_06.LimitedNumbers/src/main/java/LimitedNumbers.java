
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input < 0) break;
            list.add(input);
        }
        
        list.stream()
                .filter(m -> m > 0 && m < 6)
                .forEach(m -> System.out.println(m));
        
    }
}
