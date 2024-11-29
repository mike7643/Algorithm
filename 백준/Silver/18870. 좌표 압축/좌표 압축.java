import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader와 BufferedWriter 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력 처리
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] starr = new int[n];

        Map<Integer, Integer> map = new HashMap<>();

        // 배열 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            starr[i] = arr[i];
        }

        // 정렬
        Arrays.sort(starr);

        // 순위 맵핑
        int value = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(starr[i])) continue;
            map.put(starr[i], value);
            value++;
        }

        // 결과 출력
        for (int i = 0; i < n; i++) {
            bw.write(map.get(arr[i]) + " ");
        }
        bw.flush();  // BufferedWriter에 저장된 데이터를 출력
        bw.close();
    }
}
