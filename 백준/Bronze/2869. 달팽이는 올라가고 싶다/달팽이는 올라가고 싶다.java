import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();

        String[] arr = s.split(" ");
        
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int v = Integer.parseInt(arr[2]);
        
        int res = (int)Math.ceil((double)(v-a)/(a-b));
        System.out.println(res+1);

    }
}