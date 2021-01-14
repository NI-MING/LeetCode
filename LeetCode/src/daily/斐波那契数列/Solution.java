package 斐波那契数列;

class Solution {
    /**
     * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：
     *
     *     F(0) = 0,   F(1) = 1
     *     F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
     *     斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
     *
     *     答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1
     */
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


