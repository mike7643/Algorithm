import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int now = 1;
        while (n > count) {
            count += now * 6;
            now++;
        }
        System.out.println(now);
    }
}