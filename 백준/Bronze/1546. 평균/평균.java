import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[n];
        int max =0;
        int sum =0;
        
        for(int i =0;i<arr.length;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            if(max<arr[i])
                max=arr[i];
            sum+=arr[i];
        }
        
        System.out.println(sum*100.0/max/n);
    }
}