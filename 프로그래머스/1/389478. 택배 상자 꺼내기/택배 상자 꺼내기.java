import java.util.ArrayDeque;
import java.util.Deque;

class Solution {

    public int solution(int n, int w, int num) {
        Deque<int[]> stack = new ArrayDeque<>();

        int pos = 0; //n까지 쌓이는
        int floor = 1; //pos 가 있는 층 수
        int tgtIdx=0; // num 의 위치
        int cnt=0; // 꺼내는 박스 포함한 총 개수
        while (pos < n) { //n까지 쌓일 때까지
            if (floor % 2 != 0) {//홀수 층
                int[] arr = new int[w];

                for (int i = 0; i < arr.length; i++) {
                    pos++;
                    arr[i] = pos;
                    if (pos == num) {
                        tgtIdx=i;
                    }
                    if (pos == n) {
                        break;
                    }
                }
                stack.push(arr);
                ++floor;
            } else {
                int[] arr = new int[w];

                for (int i = arr.length-1; i>=0; i--) {
                    pos++;

                    arr[i] = pos;
                    if (pos == num) {
                        tgtIdx=i;
                    }
                    if (pos == n) {
                        break;
                    }
                }
                stack.push(arr);
                ++floor;
            }
        }

        while (true) {
            int[] popped = stack.pop();
            if (popped[tgtIdx] != num) {
                if (popped[tgtIdx] == 0) {
                    continue;
                }
                cnt++;
            } else { // num 층 포함
                cnt++;
                break;
            }
        }
        return cnt;
    }
}