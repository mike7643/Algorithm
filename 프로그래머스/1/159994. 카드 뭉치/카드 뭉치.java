import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Deque<String> queue1 = new ArrayDeque<>();
        Deque<String> queue2 = new ArrayDeque<>();

        for (String s : cards1) {
            queue1.offer(s);
        }

        for (String s : cards2) {
            queue2.offer(s);
        }

        for (String g : goal) {
            if (!queue1.isEmpty()) {
                if (queue1.peek().equals(g)) {
                    queue1.pop();
                    continue;
                }
            }
            if (!queue2.isEmpty()) {
                if (queue2.peek().equals(g)) {
                    queue2.pop();
                    continue;
                }
            }
            return "No";
        }
        return "Yes";
    }
}