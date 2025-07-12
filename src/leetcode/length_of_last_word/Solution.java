package leetcode.length_of_last_word;

/**
 * Created by Mohammad Al-Aishat on 7/12/2025.
 * Problem-Solving Project.
 */
class Solution {
    public int lengthOfLastWord(String s) {
        int lastIndex = s.length() - 1;
        int firstIndex = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(lastIndex) == ' ') lastIndex = i;
            if (s.charAt(i) != ' ') firstIndex = i;
            if (s.charAt(firstIndex) != ' ' & s.charAt(lastIndex) != ' ' && s.charAt(i) == ' ') break;
        }
        return lastIndex - firstIndex + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.lengthOfLastWord("Hello World"));
        System.out.println("---------------------");
        System.out.println(solution.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println("---------------------");
        System.out.println(solution.lengthOfLastWord("luffy is still joyboy"));
        System.out.println("---------------------");
        System.out.println(solution.lengthOfLastWord("k;fdklsja;fd8 fidsjfoiasoih sdf iasds s "));
    }
}
