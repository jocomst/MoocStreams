
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        // Write your program here
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("end")) break;
            inputs.add(input);
        }
        
        double average = inputs.stream()
                .mapToDouble(m -> Double.valueOf(m))
                .average()
                .getAsDouble();
        
        System.out.println("average of the numbers: " + average);

    }
}
