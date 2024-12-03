import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr =new int[n];

        for (int i = 0; i < n; i++)
            arr[i]= sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num,0)+1);
        }

        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            sb.append(map.getOrDefault(sc.nextInt(), 0)).append(" ");
        }

        System.out.println(sb.toString());
    }
}