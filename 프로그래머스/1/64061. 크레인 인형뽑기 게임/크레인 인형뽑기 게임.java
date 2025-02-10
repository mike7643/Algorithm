import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Deque<Integer> bucket = new ArrayDeque<>();
        int cnt = 0;

        for (int move : moves) {
            for (int x = 0; x < board.length; x++) {

                int pos = board[x][move - 1];

                if (pos == 0) {
                    continue;
                }
                if (!bucket.isEmpty()) {//비어 있지 않다면
                    if(bucket.peek()==pos){
                        cnt+=2;
                        bucket.pop();
                    }else bucket.push(pos);
                }else{
                    bucket.push(pos);
                }
                board[x][move - 1] =0;
                break;
            }
        }
        return cnt;
    }
}