import java.io.*;
import java.util.*;

public class Main {
    static int dy[] = {0, 0, 1, -1};
    static int dx[] = {1, -1, 0, 0};
    static boolean visit[][];
    static int N;
    static char arr[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new char[N][N];
        visit = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        int normal = 0;
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N; i++) {
                if (!visit[j][i]) {
                    bfs(j, i);
                    normal++;
                }
            }
        }

        visit = new boolean[N][N];
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N; i++) {
                if (arr[j][i] == 'G') {
                    arr[j][i] = 'R';
                }
            }
        }

        int blind = 0;
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N; i++) {
                if (!visit[j][i]) {
                    bfs(j, i);
                    blind++;
                }
            }
        }

        System.out.println(normal);
        System.out.println(blind);
    }

    static void bfs(int y, int x) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{y, x});
        visit[y][x] = true;
        char color = arr[y][x];

        while (!q.isEmpty()) {
            int p[] = q.poll();
            for (int i = 0; i < 4; i++) {
                int ny = p[0] + dy[i];
                int nx = p[1] + dx[i];
                if (0 <= ny && ny < N && 0 <= nx && nx < N && !visit[ny][nx]) {
                    if (arr[ny][nx] == color) {
                        visit[ny][nx] = true;
                        q.add(new int[]{ny, nx});
                    }
                }
            }
        }
    }
}
