import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        int temp = 1, result = 0;

        for (int i = 0; i < str.length; i++) {
            char c = str[i];
            if (c == '(') { // '(' -> 2 곱함
                stack.push(c); temp *= 2;
            } else if (c == '[') { // '[' -> 3 곱함
                stack.push(c); temp *= 3;
            } else if (c == ')') { // ')' -> 스택 확인 후 2 나눔
                if (stack.isEmpty() || stack.pop() != '(') {
                    System.out.println(0); return;
                }
                if (str[i - 1] == '(') result += temp;
                temp /= 2;
            } else if (c == ']') { // ']' -> 스택 확인 후 3 나눔
                if (stack.isEmpty() || stack.pop() != '[') {
                    System.out.println(0); return;
                }
                if (str[i - 1] == '[') result += temp;
                temp /= 3;
            }
        }
        System.out.println(stack.isEmpty() ? result : 0); // 스택이 비었으면 결과 출력
    }
}
