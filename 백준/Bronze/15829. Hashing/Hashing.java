import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        char[] chr = s.toCharArray();

        int total=0;


        for(int i = 0 ; i<n ; i++){
            int a = chr[i]-96;

            total += (int)(a*Math.pow(31,i));
        }
        System.out.print(total);
    }
}