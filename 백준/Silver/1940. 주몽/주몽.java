import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n+1];
        for(int i =1;i<arr.length;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        
        int srt =1;
        int end=n;
        int cnt=0;
        
        while(arr[srt]!=arr[end]){
            if(arr[srt]+arr[end]<m){
                srt++;
            }else if(arr[srt]+arr[end]>m){
                end--;
            }else{
                cnt++;
                end--;
            }
        }
        System.out.println(cnt);
    }
}