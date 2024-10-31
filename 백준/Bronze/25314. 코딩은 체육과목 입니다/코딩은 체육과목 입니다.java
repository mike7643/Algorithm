import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bytee = sc.nextInt();
        
        int cnt = bytee/4;
        
        for(int i=0;i<cnt;i++){
            System.out.print("long"+" ");
        }
        System.out.print("int");
    }
}