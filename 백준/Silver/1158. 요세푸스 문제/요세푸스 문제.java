import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        int K = sc.nextInt();

        System.out.print("<");
        int size = N;
        int i = 0;
        while (size > 0) {
            i = (i + (K - 1)) % size;

            if (size == 1) {
                System.out.print(arr[i] + ">");
            } else System.out.print(arr[i] + ", ");
            for (int a = i; a < size - 1; a++) {
                arr[a] = arr[a + 1];
            }
            size--;
        }
    }
}
