import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []nm =br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] arr = new int[n];
        int[] s = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int a = 0;a<arr.length;a++){
            arr[a]= Integer.parseInt(st.nextToken());
        }//선언과 초기화 완료.

        //합 배열 만들기
        s[0]=arr[0];
        for(int b=1;b<s.length;b++){
            s[b]=s[b-1]+arr[b];
        }

        //테스트 케이스 돌리기
        for(int t = 0;t<m;t++){
            String []req =br.readLine().split(" ");
            int i = Integer.parseInt(req[0]);
            int j = Integer.parseInt(req[1]);

            //i부터 j까지를 합배열로
            if (i == 1||j==1) {
                System.out.println(s[j - 1]);
                continue;
            }
            System.out.println(s[j - 1] - s[i - 1-1]);
        }
    }
}