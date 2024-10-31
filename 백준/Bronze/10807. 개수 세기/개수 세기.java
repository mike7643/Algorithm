import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int v = 0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int find = sc.nextInt();
        for(int j =0;j<arr.length;j++){
            if(arr[j]==find)
                v++;
        }
        System.out.println(v);
    }
}