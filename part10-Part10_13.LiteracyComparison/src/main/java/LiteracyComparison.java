
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(m -> m.split(","))
                    .sorted((a, b) -> {
                        if (Double.valueOf(a[5]) > Double.valueOf(b[5])) {
                            return 1;
                        } else if (Double.valueOf(a[5]) == Double.valueOf(b[5])) {
                            return 0;
                        } else {
                            return -1;
                        }
                    })
                    .forEach(m -> System.out.println(m[3] + " (" + m[4] + "), " + m[2].split(" ")[1] + ", " + m[5]));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
