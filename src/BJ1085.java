import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1085 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 입력 x,y , w,h
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int dis_x = w - x;
        int dis_y = h - y;
        int x_min = 0;
        int y_min = 0;

        x_min = Math.min(dis_x, x); // 좌우 최소값
        y_min = Math.min(dis_y, y); // 상하 최소값

        System.out.println(Math.min(x_min, y_min));
    }
}