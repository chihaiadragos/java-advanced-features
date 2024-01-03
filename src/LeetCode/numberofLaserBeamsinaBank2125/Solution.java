package LeetCode.numberofLaserBeamsinaBank2125;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Result 1:");
        System.out.println(numberOfBeams(new String[]{"011001", "000000", "010100", "001000"}));
        System.out.println("Result 2:");
        System.out.println(numberOfBeams(new String[]{"000", "111", "000"}));
    }
    public static int numberOfBeams(String[] bank) {
        int previously = 0;
        for (int i = 0; i < bank[0].length(); i++) {
            if (bank[0].charAt(i) == '1') {
                ++previously;
            }
        }
        int current = 0;
        int answer = 0;
        for (int i = 1; i < bank.length; i++) {
            for (int j = 0; j < bank[i].length(); j++) {
                if (bank[i].charAt(j) == '1') {
                    current++;
                }
            }
            if (current != 0) {
                answer += current * previously;
                previously = current;
                current = 0;
            }
        }
        return answer;
    }
}
