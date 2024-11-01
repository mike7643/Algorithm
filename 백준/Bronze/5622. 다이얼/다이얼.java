import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        String code = sc.next();
        int time=0;

        for(int i =0;i<code.length();i++){
            if (code.charAt(i) - 65 == 0 || code.charAt(i) - 65 == 1 || code.charAt(i) - 65 == 2) {
                time += 3;
            } else if (code.charAt(i) - 65 == 3 || code.charAt(i) - 65 == 4 || code.charAt(i) - 65 == 5) {
                time += 4;
            } else if (code.charAt(i) - 65 == 6 || code.charAt(i) - 65 == 7 || code.charAt(i) - 65 == 8) {
                time += 5;
            } else if (code.charAt(i) - 65 == 9 || code.charAt(i) - 65 == 10 || code.charAt(i) - 65 == 11) {
                time += 6;
            } else if (code.charAt(i) - 65 == 12 || code.charAt(i) - 65 == 13 || code.charAt(i) - 65 == 14) {
                time += 7;
            } else if (code.charAt(i) - 65 == 15 || code.charAt(i) - 65 == 16 || code.charAt(i) - 65 == 17 || code.charAt(i) - 65 == 18) {
                time += 8;
            } else if (code.charAt(i) - 65 == 19 || code.charAt(i) - 65 == 20 || code.charAt(i) - 65 == 21) {
                time += 9;
            } else if (code.charAt(i) - 65 == 22 || code.charAt(i) - 65 == 23 || code.charAt(i) - 65 == 24 || code.charAt(i) - 65 == 25) {
                time += 10;
            }
        }
        System.out.print(time);
    }
}