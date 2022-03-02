/*
https://leetcode.com/problems/counting-words-with-a-given-prefix/
 */

class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        int n = pref.length();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= pref.length()) {
                if(words[i].substring(0, n).equals(pref)) {
                    count++;
                }
            }
        }
        return count;
    }
}

class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] words;
        String pref;

        words = new String[]{"apple", "app", "applause", "append", "apex",};
        pref = "app";
        System.out.println(s.prefixCount(words, pref) == 4);

        pref = "ap";
        System.out.println(s.prefixCount(words, pref) == 5);

    }


}
