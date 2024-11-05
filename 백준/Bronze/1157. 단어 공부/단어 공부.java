import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        int[] num = new int[26];
        
        for(int i =0;i<str.length();i++){
            num[str.charAt(i)-65]++;
        }
        
        int max = -1;
        char ch ='?';
        
        for(int i = 0;i<26;i++){
            if(num[i]>max){
                max = num[i];
                ch=(char)(i+65);
            }else if(num[i]==max){
                ch='?';
            }
        }
        System.out.print(ch);
    }
}