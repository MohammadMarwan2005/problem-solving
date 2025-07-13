package leetcode.maximum_matching_of_players_with_trainers;

import java.util.Arrays;

/**
 * Created by Mohammad Al-Aishat on 7/13/2025.
 * Problem-Solving Project.
 */
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int p = players.length - 1;
        int t = trainers.length - 1;
        int result = 0;

        while (p >= 0 && t >= 0) {
            int currentPlayerAbility = players[p];
            int currentTrainerCapacity = trainers[t];

            if (currentPlayerAbility <= currentTrainerCapacity) {
                result++;
                t--;
            }
            p--;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] players1 = {4, 7, 9};
        int[] trainers1 = {8, 2, 5, 8};
        System.out.println(solution.matchPlayersAndTrainers(players1, trainers1)); // 2

        int[] players2 = {1, 1, 1};
        int[] trainers2 = {10};
        System.out.println(solution.matchPlayersAndTrainers(players2, trainers2)); // 1
    }
}
