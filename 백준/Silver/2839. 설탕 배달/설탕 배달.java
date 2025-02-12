import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //그리디
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt =0;

        while (true) {
            if (n < 0) {
                System.out.println(-1);
                break;
            }
            
            // 현재 n을 5로 나누어 떨어지는지 확인
            if (n % 5 == 0) {
                System.out.println(n / 5 + cnt);
                break;
            }
            
            // 3 하나 사용
            n -= 3;
            cnt++;
        }
    }
}
