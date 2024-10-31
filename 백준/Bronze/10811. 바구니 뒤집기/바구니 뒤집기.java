import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 바구니 수
        int m = sc.nextInt(); // 반전 명령 수
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i]=i+1; // 바구니 초기화 [1, 2, ..., n]

        for(int j=0;j<m;j++){
            int a=sc.nextInt();
            int b=sc.nextInt();

            // 1-based to 0-based 인덱스로 변환
            int start = a - 1;
            int end = b - 1;

            // 두 포인터를 이용하여 구간 반전
            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
