import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count =0;
        int result=0;
        for(int i =1;i<=n;i++){
            if(n%i==0){
                count++;
                result =i;
            }
            if(count==k){
                break;
            }
        }
        if(count<k){
            System.out.println(0);
        }else
            System.out.println(result);
    }
}