class Solution {
    public int solution(int N) {
        int count = 2;
        for (int i = 2; i <= N / 2; i++) {
            if (N % i == 0) {
                count++;
               
            }
            
        }
        return count;
    }
}