import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int n = sc.nextInt();
            int total =0;
            
            if(n== -1)
                break;
            
            for(int i=1;i<n;i++){
                if(n%i==0)
                    total+=i;
            }
            
            if(total == n){
                System.out.print(n+" = ");
                for(int j =1;j<n;j++){
                    
                    if(j!=1 && n%j==0){
                        System.out.print(" + ");
                    }
                    if(n%j==0)
                        System.out.print(j);
                }
                System.out.println();
            }else
                System.out.println(n+" is NOT perfect.");
        }
    }
}