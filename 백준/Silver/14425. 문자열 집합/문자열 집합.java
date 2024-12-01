import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt=0;
        Set<String> set = new HashSet<>();

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextLine());
        }

        for (int i = 0; i < m; i++) {
            if (set.contains(sc.nextLine())) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
