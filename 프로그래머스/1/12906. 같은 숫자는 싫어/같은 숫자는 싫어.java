import java.util.*;

public class Solution {
    public Integer[] solution(int []arr) {
        
        ArrayDeque<Integer> que = new ArrayDeque<>();
        for(int i = 0 ; i<arr.length; i++){
            if(i ==0){
                que.offerLast(arr[i]);
            }
            if(que.peekLast() == arr[i])
                continue;
            que.offerLast(arr[i]);
        }
        
        return que.toArray(new Integer[0]);
    }
}