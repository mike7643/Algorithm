
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[][] map;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Machine machine = new Machine(r, c, d);
        System.out.println(machine.move());
    }

    static class Machine {
        int r, c, d;
        int cnt = 0;

        public Machine(int r, int c, int d) {
            this.r = r;
            this.c = c;
            this.d = d;
        }

        public int move() {
            while (true) {
                // 현재 위치 청소
                if (map[r][c] == 0) {
                    map[r][c] = 2; // 청소!
                    cnt++;
                }

                boolean moved = false;
                for (int i = 0; i < 4; i++) {
                    d = (d + 3) % 4; // 반시계 방향
                    int x = r + dx[d];
                    int y = c + dy[d];

                    if (map[x][y] == 0) { // 청소 안된 칸 이동
                        r = x;
                        c = y;
                        moved = true;
                        break;
                    }
                }

                if (!moved) { // 네 방향 모두 청소되었거나 벽
                    int back = (d + 2) % 4; // 후진
                    int x = r + dx[back];
                    int y = c + dy[back];

                    if (map[x][y] == 1) { // 후진 불가능하면 종료
                        break;
                    }
                    r = x;
                    c = y;
                }
            }
            return cnt;
        }
    }
}

