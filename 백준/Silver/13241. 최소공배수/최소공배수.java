import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //유클리드 호제법 사용
        long a = sc.nextLong();
        long b = sc.nextLong();

        long gcd = GCD(a, b);
        System.out.println((a * b) / gcd);
    }

    public static long GCD(long a, long b) {

        long x = Math.max(a, b);
        long y = Math.min(a, b);
        long c;

        if (x % y != 0) {
            c = x % y;
            return GCD(y, c);
        } else
            return y;
    }
}
