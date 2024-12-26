class Solution {
    public double solution(int[] arr) {
        double res = 0;
        for(int a : arr)
            res+=a;
        
        return res/ arr.length;
    }
}