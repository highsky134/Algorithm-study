import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1267 {
     public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int calls = Integer.parseInt(br.readLine());
        int mSum = 0;
        int ySum = 0;
        int callTimes = 0;

        for (int i = 0; i < calls; i++) {
            callTimes = Integer.parseInt(br.readLine());
            mSum += ((callTimes / 60) + 1) * 15;
            ySum += ((callTimes / 30) + 1) * 10;
        }

         if (mSum == ySum) {
             System.out.println("Y M " + ySum);
         } else if (mSum < ySum) {
             System.out.println("M " + mSum);
         } else {
             System.out.println("Y " + ySum);
         }

    }
}
