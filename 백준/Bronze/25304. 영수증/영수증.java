import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tot =sc.nextInt();
        int cnt = sc.nextInt();
        int check=0;
        for(int i=0;i<cnt;i++){
            int price = sc.nextInt();
            int count = sc.nextInt();
            check+=(price*count);
        }
        
        if(tot==check)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}