import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<Integer, String> numToStr = new HashMap<>();
        Map<String, Integer> StrToNum = new HashMap<>();

        for(int i = 1 ; i<=n; i++){
            String a= br.readLine();
            numToStr.put(i,a);
            StrToNum.put(a,i);
        }
        for(int i = 1; i<=m ; i++) {
            String a = br.readLine();
            int num;
            if(a.charAt(0)>48 && a.charAt(0)<58){
                num = Integer.parseInt(a);
                System.out.println(numToStr.get(num));
            }else System.out.println(StrToNum.get(a));
        }
    }
}
