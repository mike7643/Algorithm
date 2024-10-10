import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] res = new int[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = sc.nextInt();
        }
        int maxSum=0;

        for (int i = res.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                for (int k = j - 1; k >= 0; k--) {
                    int sumArr = (res[i] + res[j] + res[k]);
                    if (sumArr <= m && sumArr > maxSum) {
                        maxSum=sumArr;
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}