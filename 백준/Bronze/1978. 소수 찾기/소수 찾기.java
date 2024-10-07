import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        int num = sc.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < num; j++) {
            if (depends(arr[j]))
                cnt++;
        }
        System.out.println(cnt);
    }

    public static boolean depends(int a) {
        if(a==1)
            return false;
        
        for (int i = 2; i < a; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }
}