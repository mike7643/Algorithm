import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String fir = sc.next();
        String sec = sc.next();
        
        System.out.println(Math.max(Integer.parseInt(change(fir)), Integer.parseInt(change(sec))));
    }
        
    static String change(String a){
        char[] ch = a.toCharArray();
        char temp= ch[2];
        ch[2]=ch[0];
        ch[0]=temp;
        
        return String.valueOf(ch);
    }
}