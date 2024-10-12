import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        //가장 잘 본 성적 거르기
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        
        //새로운 평균 구하기
        double sco=0;
        for(int i=0;i<arr.length;i++){
            sco += (double) arr[i]/max*100;
        }
        double res = sco/arr.length;
        
        System.out.println(res);
    }
}