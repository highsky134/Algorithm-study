import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class BJ1076 {

    public static void main(String[] args) throws IOException {

        List<String> colors = new ArrayList<>(
                List.of("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white")
        );
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input1 = colors.indexOf(br.readLine().toLowerCase()) * 10;
        int input2 = colors.indexOf(br.readLine().toLowerCase());
        long input3 = colors.indexOf(br.readLine().toLowerCase());

        System.out.println((input1 + input2)*(long)Math.pow(10, input3));
    }
}
