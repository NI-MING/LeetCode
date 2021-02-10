package 最长公共子串;

class Solution {
    /**最长公共子串
     * 动态规划
     */
    public static void main(String[] args) {
        String str1 = "1AB2345CD";
        String str2 = "12345EF";
        Solution solution = new Solution();
        String ans = solution.LCS(str1,str2);
        System.out.println(ans);
    }

    public String LCS(String str1,String str2) {
        int maxLength = 0; // 最大长度
        int maxIndex = 0; // 最长子串在str1中最后结束的索引
        int[][] dp = new int[str1.length()+1][str2.length()+1];
        for(int i = 0;i<str1.length();i++){
            for(int j = 0;j<str2.length();j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    dp[i+1][j+1] = dp[i][j] + 1;
                    if(dp[i+1][j+1] > maxLength){
                        maxLength = dp[i+1][j+1];
                        maxIndex = i;
                    }
                }else {
                    dp[i+1][j+1] = 0;
                }
            }
        }
        return str1.substring(maxIndex - maxLength + 1,maxIndex + 1);
    }

}