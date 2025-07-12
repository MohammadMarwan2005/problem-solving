package leetcode.find_the_index_of_the_first_occurrence_in_a_string;

/**
 * Created by Mohammad Al-Aishat on 7/12/2025.
 * Problem-Solving Project.
 */
class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {

            int remainingLength = haystack.length() - i;
            if (remainingLength < needle.length()) break;

            if (haystack.startsWith(needle, i)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.strStr("sadbutsad", "sad")); // 0
        System.out.println(solution.strStr("happybutsad", "sad")); // 8
        System.out.println(solution.strStr("leetcode", "leeto")); // -1
        System.out.println(solution.strStr("sa", "sad")); // -1
    }
}
