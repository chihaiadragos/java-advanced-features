package LeetCode.findPlayersWithZeroOrOneLosses2225;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findWinners(new int[][]{{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}}));
        System.out.println(findWinners(new int[][]{{2, 3}, {1, 3}, {5, 4}, {6, 4}}));
    }
    public static List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> winners = new HashSet<>();
        Map<Integer, Integer> losers = new HashMap<>();
        for (int[] match : matches) {
            losers.put(match[1], losers.getOrDefault(match[1], 0) + 1);
        }
        for (int[] match : matches) {
            if (!losers.containsKey(match[0])) {
                winners.add(match[0]);
            }
        }
        List<Integer> winnersList = new ArrayList<>(winners);
        List<Integer> losersList = new ArrayList<>();
        for (int loser : losers.keySet()) {
            if (losers.get(loser) == 1) {
                losersList.add(loser);
            }
        }
        Collections.sort(winnersList);
        Collections.sort(losersList);
        List<List<Integer>> result = new ArrayList<>();
        result.add(winnersList);
        result.add(losersList);
        return result;
    }
}
