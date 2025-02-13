import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] dy = new int[]{1, -1, 0, 0};
    static int[] dx = new int[]{0, 0, -1, 1};
    static boolean[][] visit;
    static int[][] map;
    static List<Integer> res = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map = new int[n + 1][n + 1];
        visit = new boolean[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            String line = br.readLine();
            for (int j = 1; j <= n; j++) {
                map[i][j] = line.charAt(j-1) - '0';
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(map[i][j]!=0 && !visit[i][j]){
                    int bfsCnt = bfs(i, j, n);
                    res.add(bfsCnt);
                }
            }
        }
        Collections.sort(res);
        System.out.println(res.size());
        for (Integer r : res) {
            System.out.println(r);
        }
    }

    static int bfs(int y, int x, int n) {
        Deque<Node> queue = new ArrayDeque<>();
        queue.offer(new Node(y, x));

        visit[y][x] = true;

        int bucCnt = 1;
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            for (int d = 0; d < 4; d++) {
                int ny = node.y + dy[d];
                int nx = node.x + dx[d];

                if (ny < 1 || ny > n || nx < 1 || nx > n || visit[ny][nx]|| map[ny][nx] == 0) continue;

                queue.offer(new Node(ny, nx));
                visit[ny][nx]=true;
                bucCnt++;
            }
        }
        return bucCnt;
    }
    static class Node{
        int y,x;

        public Node(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}
