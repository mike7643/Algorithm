import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//낚시왕 가장 오른쪽 열의 오른쪽 칸에 이동하면 이동 멈춤
//오른쪽 한 칸씩 이동
// 같은 열에 있는 상어 중에서 땅과 제일 가까운 상어를 잡는다.
//상어를 잡으면 격자판에서 잡은 상어 사라짐.
//상어가 이동
//-> 격자판 넘기면 반대로 바꿔서 속력 유지 이동
// 만약 상어 겹치면 상어 모두 잡아먹음


// 시뮬레이션
// 3가지 큰 처리가 반복 (낚시왕이 이동해서 상어를 잡는다. => 상어들이 이동 => 겹치는 상어를 정리 )
// shark 5개 필드를 가지는 클래스 정의
// 2차원 배열 + arrayList 사용
// s(스피드) 에 따른 상어 각각의 이동 시 s 만큼 움직이면 시간 손해
public class Main{

    static int R,C,M,sum;
    static Shark[][] map;
    static List<Shark> list = new ArrayList<>();

    //상 -> 하 -> 우 -> 좌 (순서 필요)
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, 1, -1};


    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new Shark[R + 1][C + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            Shark shark = new Shark(r, c, s, d-1, z); // 상하우좌가 1 2 3 4 이니까 d-1
            list.add(shark);
            map[r][c] = shark;
        }

        for (int i = 1; i <=C; i++) {
            catchShark(i);
            moveShark();
            killShark();
        }
        System.out.println(sum);
    }

    // 현재 자리에서 상어 잡기
    static void catchShark(int col) {
        //밑으로 내려가면서 상어를 만나면 sum 추가, list 제거(정제) 뒤에서 한 꺼번에 list를 이용해서 map을 초기화.
        for (int i = 1; i <= R; i++) {
            Shark catchedShark = map[i][col];
            if (catchedShark != null) {//상어 발견 !
                sum += catchedShark.z;
                list.remove(catchedShark);
                break;
            }
        }
    }

    // 상어 이동
    // map 이 아닌 ArrayList 에서 진행
    static void moveShark() {
        for (Shark shark : list) {
            int r = shark.r;
            int c = shark.c;
            int s = shark.s;
            int d = shark.d;

            switch (d) {
                // 상하, 좌우 따로 나누어서 각 R, C 를 이용해서 제자리로 오는 부분 처리를 이용

                //상하 (R 이용)
                case 0:
                case 1:
                    s %= (R * 2 - 2);
                    for (int i = 0; i < s; i++) {
                        if(r == 1) d =1;
                        else if(r == R) d = 0;
                        r += dy[d];
                    }
                    shark.r = r;
                    shark.d = d;
                    break;

                //우좌 (C 이용)
                case 2:
                case 3:
                    s %= ( C * 2 -2);
                    for (int i = 0; i < s; i++) {
                        if(c ==1) d =2;
                        else if(c == C) d = 3;
                        c += dx[d];
                    }
                    shark.c = c;
                    shark.d = d;
                    break;
            }
        }
    }

    // 같은 위치의 큰 상어가 작은 상어를 잡아 먹는다.
    // list (정제된) shark 데이터를 이용해서 map[][] 초기화
    static void killShark() {
        // map null 초기화
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                map[i][j] = null;
            }
        }

        //list로부터 정제된 Shark 객체를 하나씩 처리
        //겹치는 상어에 대한 처리(삭제는 list에서 처리)
        int size = list.size();
        for (int i = size - 1; i >= 0; i--) {
            Shark s = list.get(i);

            if (map[s.r][s.c] == null) {
                map[s.r][s.c] = s;
            } else if (map[s.r][s.c].z < s.z) { //초기화 후 자리 잡은 shark가 있다. 근데 꺼낸 s의 사이즈(z)가 더 큰 경우
                list.remove(map[s.r][s.c]);
                map[s.r][s.c] = s;
            } else { // 이미 자리잡은 상어가 더 커서 꺼낸 s 잡아먹힐때
                list.remove(s);
            }
        }
    }

    static class Shark{
        int r,c,s,d,z;

        public Shark(int r, int c, int s, int d, int z) {
            this.r = r;
            this.c = c;
            this.s = s;
            this.d = d;
            this.z = z;
        }
    }

}
