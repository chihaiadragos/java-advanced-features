package LeetCode.meetingRoomsIII2402;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(mostBooked(2, new int[][]{{0,10},{1,5},{2,7},{3,4}}));
        System.out.println(mostBooked(3, new int[][]{{1,20},{2,10},{3,5},{4,9},{6,8}}));
    }
    public static int mostBooked(int n, int[][] meetings) {
        int[] ans = new int[n];
        long[] times = new long[n];
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        for (int[] meeting : meetings) {
            int start = meeting[0], end = meeting[1];
            boolean flag = false;
            int minind = -1;
            long val = Long.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (times[j] < val) {
                    val = times[j];
                    minind = j;
                }
                if (times[j] <= start) {
                    flag = true;
                    ans[j]++;
                    times[j] = end;
                    break;
                }
            }
            if (!flag) {
                ans[minind]++;
                times[minind] += (end - start);
            }
        }

        int maxi = -1, id = -1;
        for (int i = 0; i < n; i++) {
            if (ans[i] > maxi) {
                maxi = ans[i];
                id = i;
            }
        }
        return id;
    }
}
