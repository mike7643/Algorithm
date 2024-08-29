import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        
        for(int i=0;i<9;i++){
            arr[i]=sc.nextInt();
        }
        int biggest=0;
        
        for(int j=0;j<9;j++){
            if(arr[biggest]<arr[j]){
                biggest=j;
            }else
                continue;
        }
        System.out.println(arr[biggest]);
        System.out.println(biggest+1);
    }
}