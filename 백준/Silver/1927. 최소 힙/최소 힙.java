import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                sb.append(pqueue.isEmpty() ? "0" : pqueue.poll()).append("\n");
            } else {
                pqueue.offer(num);
            }
        }

        System.out.print(sb); // 한 번에 출력
        br.close();
    }
}
