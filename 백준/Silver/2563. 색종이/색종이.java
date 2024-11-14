import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        boolean[][] a = new boolean[101][101];
        int count=0;

        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());

            for(int k=x;k<x+10;k++){
                for(int j=y;j<y+10;j++)
                    a[k][j] = true;
            }
        }

        for(int i=0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                if(a[i][j]){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}