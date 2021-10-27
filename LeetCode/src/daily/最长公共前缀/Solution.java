class Solution {

    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        for (String str : strs) {
            int index = 0;
            while (index < Math.min(ans.length(),str.length()) && ans.charAt(index) == str.charAt(index)){
                index++;
            }
            ans = ans.substring(0,index);
        }
        return ans;
    }
}
