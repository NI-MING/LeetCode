package 字符串相加;

class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuffer stringBuffer = new StringBuffer();
        int add = 0;
        while(i >= 0 || j >=0 || add!= 0){
            int t1 = i>= 0 ? num1.charAt(i) - '0': 0;
            int t2 = j>= 0 ? num2.charAt(j) - '0': 0;
            int res = t1 + t2 + add;
            stringBuffer.append((char)(res%10 + '0'));
            add = res / 10;
            i--;
            j--;
        }
        stringBuffer.reverse();
        return stringBuffer.toString();
    }
}