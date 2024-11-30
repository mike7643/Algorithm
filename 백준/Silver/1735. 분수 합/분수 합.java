import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        int c;
        int d;

        c=((a1 * b2) + (a2 * b1));
        d = a2 * b2;

        int gcd = GCD(c, d);

        System.out.println(c / gcd + " " + d / gcd);
    }

    public static int GCD(int a, int b) {
        int x = Math.max(a,b);
        int y = Math.min(a,b);

        int z = x % y;

        if (z != 0) {
            return GCD(y, z);
        }else return y;
    }
}
