import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];


        while (true) {

            for (int i = 0; i < 3; i++)
                arr[i] = sc.nextInt();

            for (int i = 0; i < 2; i++) {
                if (arr[i] > arr[i + 1]) {
                    int swap = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = swap;
                }
            }

            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0)
                break;

            if (arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2])
                System.out.println("right");
            else
                System.out.println("wrong");
        }
    }
}
