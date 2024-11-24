import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a;
        int b;
        int total;
        int min = Integer.MAX_VALUE;

        for (a = 0; a <= 1673; a++) {
            for (b = 0; b <= 1000; b++) {
                if (n == 3 * a + 5 * b) {
                    total = a + b;
                    if (min > total)
                        min = total;
                }
            }
        }
        if (min == Integer.MAX_VALUE) {
            System.out.println(-1);
        }else System.out.println(min);
    }
}