import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10807 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int brInt = Integer.parseInt(br.readLine());
        int[] a = new int[brInt];

        for (int i = 0; i < brInt; i++) {
            a[i] = (int)(Math.random() * 4 + 1);
            System.out.print(a[i]+ " ");
        }
        System.out.println();

        int third = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i : a) {
            if (i == third) ++count;
        }
        System.out.println(count);

    }
}
