
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers. type \"end\" to stop");
        
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("end")) break;
            list.add(input);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();
        if (choice.equals("n")) {
            double negativeAverage = list.stream()
                    .mapToDouble(m -> Double.valueOf(m))
                    .filter(m -> m < 0.0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers; " + negativeAverage);
        }
        
        if (choice.equals("p")) {
            double positiveAverage = list.stream()
                    .mapToDouble(m -> Double.valueOf(m))
                    .filter(m -> m > 0.0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + positiveAverage);
        }
    }
}
