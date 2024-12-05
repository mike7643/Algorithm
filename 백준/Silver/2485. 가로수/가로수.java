import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] base = new int[n];

        for (int i = 0; i < n; i++) {
            base[i]=sc.nextInt();
        }

        int[] gap = new int[n - 1];

        for (int i = 0; i < gap.length; i++) {
            gap[i]=base[i+1]-base[i];
        }


        int real = gap[0];
        for (int i = 1; i < gap.length; i++) {
            real = getGCD(real, gap[i]);
        }

        int total = base[base.length - 1] - base[0];
        int allCount = total / real + 1;
        int res = allCount - base.length;

        System.out.println(res);
    }

    public static int getGCD(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int lst = max % min;

        if (lst != 0) {
            return getGCD(min, lst);
        }else return min;
    }
}