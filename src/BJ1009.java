import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseNum = Integer.parseInt(br.readLine());

        int a, b, c, answer;
        for (int i = 0; i < caseNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = 0;
            answer = 1;

            if (a % 10 == 0 || a % 10 == 1 || a % 10 == 5 || a % 10 == 6) {
                answer = a % 10;
            } else if (a % 10 == 4 || a % 10 == 9) {
                c = b % 2;
                if (c == 0) c = 2;
            } else {
                c = b % 4;
                if (c == 0) c = 4;
            }

            for (int j = 0; j < c; j++) answer = (answer * a) % 10;
            if (answer == 0) answer = 10;
            System.out.println(answer);
        }
    }
}
