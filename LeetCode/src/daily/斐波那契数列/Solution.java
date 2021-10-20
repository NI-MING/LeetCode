package 斐波那契数列;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.fib1(5);
        System.out.println(ans);
    }

    public int fib1(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;dp[1] = 1;
        int i;
        for(i = 2;i<n;i++){
            dp[i] = dp[i-1] + dp[i-2];
            dp[i] = dp[i] % 1000000007;
        }
        return dp[--i];
    }

    public int fib2(int n) {
        int a = 0, b = 1, sum;
        for(int i = 0; i < n; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}


