import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        
        for(int i=0;i<n;i++){
            String [] s =br.readLine().split(" ");
            arr[i][0]=Integer.parseInt(s[0]);
            arr[i][1]=Integer.parseInt(s[1]);
        }
        
        Arrays.sort(arr, (n1, n2)-> {
            if(n1[0]==n2[0]){
                return Integer.compare(n1[1], n2[1]);
            }else return Integer.compare(n1[0], n2[0]);
        });
        
        for (int i =0;i<n;i++){
            System.out.println(arr[i][0] + " "+arr[i][1]);
        }
    }
}