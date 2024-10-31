import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = sc.nextInt();
        int[]arr= new int[n];

        
        for(int i=0;i<cnt;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int k=sc.nextInt();
            for(;a<=b;a++){
                arr[a-1]=k;
            }
        }
        
        for(int i : arr)
            System.out.print(i+" ");
    }
}