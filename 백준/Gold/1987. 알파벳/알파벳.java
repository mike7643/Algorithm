import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int R, C;
    static boolean[] visited;
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};
    static char[][] arr;
    static int max=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        arr = new char[R][];

        for (int i = 0; i < R; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        visited = new boolean[26];

        dfs(0, 0, 1);
        System.out.println(max);

    }

    static void dfs(int y, int x, int cnt) {
        if (max < cnt) {
            max =cnt;
        }
        visited[arr[y][x] - 'A'] = true;

        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (ny >= 0 && ny < R && nx >= 0 && nx < C && !visited[arr[ny][nx] - 'A']) {
                dfs(ny, nx, cnt + 1);
            }
        }
        visited[arr[y][x]-'A'] = false;
    }
}
