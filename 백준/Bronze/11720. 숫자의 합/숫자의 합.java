import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String a = sc.next();
        int result = 0;
        
        sc.close();
        for(int i =0;i<n;i++){
            result += a.charAt(i) - '0';
        }
        System.out.print(result);
    }
}
