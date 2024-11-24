import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt=0;
        int i =0;
        while(true){
            i++;
            if(Integer.toString(i).contains("666"))
                cnt++;
            if(cnt==n) {
                System.out.print(i);
                break;
            }
        }
    }
}