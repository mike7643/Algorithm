import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String[] split = br.readLine().split(" ");
        int m = Integer.parseInt(split[0]);
        int n = Integer.parseInt(split[1]);

        char[][] arr = new char[m][n];

        for (int i = 0; i < arr.length; i++) {
            char[] chr = br.readLine().toCharArray();
            System.arraycopy(chr, 0, arr[i], 0, arr[i].length);
        }
        //체스판 다 입력함

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length-8; i++) {
            for (int j = 0; j <= arr[i].length-8; j++) {
                int w_cnt = 0;
                for (int k = i; k < 8 + i; k++) { //체스판 탐색하면서 검토
                    for (int o = j; o < 8 + j; o++) {
                        if ((k + o) % 2 == 1 && arr[k][o] == 'W') {
                            w_cnt++;
                        } else if ((k + o) % 2 == 0 && arr[k][o] == 'B') {
                            w_cnt++;
                        }
                    }
                }
                min = Math.min(min, Math.min(w_cnt, 64-w_cnt));
            }
        }
        System.out.println(min);
    }
}
