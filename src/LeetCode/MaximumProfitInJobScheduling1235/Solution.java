package LeetCode.MaximumProfitInJobScheduling1235;

import java.util.Arrays;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(jobScheduling(new int[]{1, 2, 3, 3}, new int[]{3, 4, 5, 6}, new int[]{50, 10, 40, 70}));
        System.out.println(jobScheduling(new int[]{1, 2, 3, 4, 6}, new int[]{3, 5, 10, 6, 9}, new int[]{20, 20, 100, 70, 60}));
        System.out.println(jobScheduling(new int[]{1, 1, 1}, new int[]{2, 3, 4}, new int[]{5, 6, 4}));
    }
    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] jobs = new int[n][3];
        for(int i=0;i<n;i++){
            jobs[i] = new int[]{startTime[i],endTime[i],profit[i]};
        }

        Arrays.sort(jobs,(a, b) -> a[1] - b[1]);

        TreeMap<Integer,Integer> dp = new TreeMap<>();
        dp.put(0,0);

        for(int[] job:jobs){
            int val = job[2] + dp.floorEntry(job[0]).getValue();
            if(val>dp.lastEntry().getValue()){
                dp.put(job[1],val);
            }
        }

        return dp.lastEntry().getValue();
    }
}
