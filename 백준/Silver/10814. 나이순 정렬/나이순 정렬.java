import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[][] str = new String[n][2];

        for(int i = 0 ; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            str[i][0]=st.nextToken();
            str[i][1]=st.nextToken();
        }

        Arrays.sort(str, (n1 , n2)->{
            int a1 = Integer.parseInt(n1[0]);
            int a2 = Integer.parseInt(n2[0]);

            if(a1 != a2)
                return Integer.compare(a1, a2);

            return 0;
        });
        for(int i = 0; i<n ; i++){
            System.out.println(str[i][0]+" "+str[i][1]);
        }
    }
}