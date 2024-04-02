import java.util.*;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;

        for (int i=1; i<=count; i++) {
            sum += price * i;
        }

        if (money > sum) {
            answer = 0;
        }else if (sum > money) {
            answer = sum - money;
        }

        return answer;
    }
}