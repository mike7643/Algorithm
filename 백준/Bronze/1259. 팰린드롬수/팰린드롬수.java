import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.next();
            if (str.equals("0"))
                break;

            boolean isTrue = check(str);
            if (isTrue) {
                System.out.println("yes");
            }else System.out.println("no");
        }
    }

    private static boolean check(String str) {
        for (int i = 0; i <= str.length() / 2; i++) {

            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}