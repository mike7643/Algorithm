import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (isGroupWord(s)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    // 그룹 단어인지 확인하는 메서드
    public static boolean isGroupWord(String s) {
        for (int j = 0; j < s.length(); j++) {
            char currentChar = s.charAt(j);
            int firstIndex = s.indexOf(currentChar);
            int lastIndex = s.lastIndexOf(currentChar);

            // 첫 번째 위치와 마지막 위치 사이에 다른 문자가 있는지 확인
            for (int k = firstIndex; k < lastIndex; k++) {
                if (s.charAt(k) != currentChar) {
                    return false; // 다른 문자가 끼어 있으면 그룹 단어가 아님
                }
            }
        }
        return true;
    }
}
