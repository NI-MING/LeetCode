package 最长回文子串

fun main() {
    var str = "cbbd"
    val solution = Solution()
    solution.longestPalindrome(str).also(::println)
}

class Solution {
    /**
     * 最长回文子串
     * 给你一个字符串 s，找到 s 中最长的回文子串。
     */
    fun longestPalindrome(s: String): String {
        if (s.length < 2) return s
        var maxLine = 1
        var begin = 0
        val dp = Array(s.length) { BooleanArray(s.length)}

        for (i in dp.indices){
            dp[i][i] = true
        }

        for (L in 2..s.length) {
            for (i in s.indices) {
                val j = i + L -1
                if(j >= s.length) break
                if(s[i] != s[j]) {
                    dp[i][j] = false
                }else{
                    if (j - i < 3){
                        dp[i][j] = true
                    }else{
                        dp[i][j] = dp[i + 1][j - 1]
                    }
                }
                if (dp[i][j] && j - i + 1 > maxLine){
                    maxLine = j - i + 1
                    begin = i
                }
            }
        }
        return s.substring(begin,begin + maxLine)
    }

}