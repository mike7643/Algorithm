import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()); //개수 췍     
        String sNum = br.readLine(); //공백없는 숫자 췍
        char[] cNum = sNum.toCharArray(); // char 배열로
        int sum=0;
        
        for(int i =0 ; i<cNum.length; i++){
            sum+= cNum[i] - 48;
        }
        
        System.out.println(sum);
    }
}