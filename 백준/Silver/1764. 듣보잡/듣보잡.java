import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[]nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        Set<String> hear = new HashSet<>();
        Set<String> watch = new HashSet<>();

        for(int i = 0 ; i<n ; i++)
            hear.add(br.readLine());
        for(int i = 0 ; i<m ; i++)
            watch.add(br.readLine());

        Set<String> listSet = new TreeSet<>();
        for(String s : hear){
            if(!watch.contains(s))
                continue;
            listSet.add(s);
        }

        for(String s : watch){
            if(!hear.contains(s))
                continue;
            listSet.add(s);
        }

        System.out.println(listSet.size());
        for(String s : listSet){
            System.out.println(s);
        }
    }
}