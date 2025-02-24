import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[][] arr = new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            st= new StringTokenizer(br.readLine());
            for(int j =1;j<=n;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        
        int [][] s = new int[n+1][n+1];
        
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                s[i][j]=s[i][j-1] + s[i-1][j] - s[i-1][j-1] + arr[i][j];
            }
        }
        
        
        for(int k=0;k<m;k++){
            st= new StringTokenizer(br.readLine());
            int x1= Integer.parseInt(st.nextToken());
            int y1= Integer.parseInt(st.nextToken());
            int x2= Integer.parseInt(st.nextToken());
            int y2= Integer.parseInt(st.nextToken());
        
            System.out.println(s[x2][y2] - s[x1-1][y2]-s[x2][y1-1]+s[x1-1][y1-1]);
        }
        
    }
}