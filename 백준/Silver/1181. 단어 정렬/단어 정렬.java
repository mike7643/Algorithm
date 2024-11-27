import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String [] str = new String[n];
        
        for(int i = 0; i<n ;i++){
            str[i]=br.readLine();
        }
        
        Arrays.sort(str, (s1,s2)->{
           if(s1.length()!=s2.length())
               return Integer.compare(s1.length(), s2.length());
           else
                return s1.compareTo(s2);
        });
        String dupl="";
        for(int i=0;i<n;i++){
            if(!str[i].equals(dupl))
            System.out.println(str[i]);
            dupl = str[i];
        }
    }
}