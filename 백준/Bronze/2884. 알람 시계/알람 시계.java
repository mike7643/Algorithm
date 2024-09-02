import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        
        int rh,rm;
        
        int tot= h * 60 + m;
        int res= tot-45;
        
        if(res<0){
            res+=1440;
        }        
        rh = res/60;
        rm = res%60;
        
        System.out.print(rh+" "+rm);
    }
}