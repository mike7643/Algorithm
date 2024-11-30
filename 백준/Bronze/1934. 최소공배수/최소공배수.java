import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //유클리드 호제법 사용
        for(int i = 0 ; i<n ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int gcd = GCD(a, b);
            System.out.println((a * b) / gcd);

        }

    }
    public static int GCD(int a , int b){

        int x = Math.max(a,b);
        int y = Math.min(a,b);
        int c;

        if(x % y != 0){
            c = x % y;
            return GCD(y ,c);
        }else
            return y;
    }
}