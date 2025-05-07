import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        // 수열 입력 받기
        int[] nums = new int[n + 1]; // 끝처리 위해 n+1 크기로 선언
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int total = 0;


        while (start <= n && end <= n) {
            if (total >= s) {
                // 조건을 만족
                min = Math.min(min, end - start);
                // 왼쪽 포인터 이동해서 더 짧게
                total -= nums[start++];
            } else {
                // 합이 부족하면 더 길게
                total += nums[end++];
            }
        }

        System.out.println(min == Integer.MAX_VALUE ? "0" : min);
    }
}
