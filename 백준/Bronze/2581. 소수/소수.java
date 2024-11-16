import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int total = 0;
        int cnt = 0;
        int min = 0;

        for(int i = m;i<=n;i++) {//m ~ n 루프
            int result = func(i); // 소수 확인기 -> 소수면 i, 아니면 0

            if (result == 0)//소수가 아닐 때
                continue;

            cnt++;//소수 개수 카운터
            total += result;//소수가 맞을 때 합

            if (cnt == 1) {
                min = result;
            }
        }
        if(cnt>0) {
            System.out.println(total);
            System.out.println(min);
        }else
            System.out.print(-1);
    }


    static int func(int i){
        int count =0;

        for(int j=1;j<=i;j++){

            if (i == 1) {
                return 0;
            }
            if(i%j==0){
                count++;
            }


            if(count>2){//소수가 아님
                return 0;
            }
        }
        return i; //소수임
    }
}