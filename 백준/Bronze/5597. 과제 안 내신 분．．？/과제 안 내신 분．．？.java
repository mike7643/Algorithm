 import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[31];
        
        for(int i=1;i<=28;i++){
            int a=sc.nextInt();
            arr[a]=a;
        }
        for(int j=1;j<=30;j++){
            if(arr[j]==0)
                System.out.println(j);
        }
    }
}