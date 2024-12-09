import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        long total=0;
        long r =1;
        int mod = 1234567891;

        for(int i = 0 ; i<n ; i++){
            total += ((s.charAt(i) - 'a' + 1) * r) % mod;
            r = (r*31)%mod;
        }

        System.out.print(total%mod);
    }
}