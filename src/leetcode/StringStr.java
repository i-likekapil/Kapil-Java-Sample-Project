package leetcode;

public class StringStr {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi","issip"));
    }

    public static int strStr(String s1, String s2) {
        /*if (s1.length() < s2.length()) return -1;
        int ans = 1;
        int firstIndex = -1;
        int j = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (j < s2.length()) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    if (firstIndex == -1) {
                        firstIndex = i;
                    }
                    ans ++;
                    j++;
                }else{
                    ans++;

                }
            }
        }
        System.out.println(ans+" "+j+" "+firstIndex);
        return j == s2.length() ? firstIndex : -1;*/


        if(s1.length() == 0 && s2.length() == 0 ) return 0;
        if(s1.length() != 0 && s2.length() == 0 ) return 0;
        if (s1.length() < s2.length()) return -1;

        String[] arr = s1.split(s2);
        if(arr.length >1) return arr[0].length();
        return -1;
    }
}
