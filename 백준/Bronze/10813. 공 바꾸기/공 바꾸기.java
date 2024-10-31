import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        int m =sc.nextInt();
        int[] arr = new int[n+1];
        
        
        for(int i=1;i<=n;i++){
            arr[i]=i;
        }
        
        for(int j=1;j<=m;j++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }
        
        for(int k=1;k<=n;k++)
            System.out.print(arr[k]+" ");
    }
}