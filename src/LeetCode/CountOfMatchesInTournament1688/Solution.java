package LeetCode.CountOfMatchesInTournament1688;

class Solution {
    public static void main(String[] args) {
        int n = 7;
        int matches = numberOfMatches(n);
        System.out.println("Number of matches played: " + matches);
    }
    public static int numberOfMatches(int n) {
        if(n==1) {
            return 0;
        }
        if(n%2==0){
            int matches = n/2;
            return matches + numberOfMatches(n/2);
        } else {
            int matches = (n-1)/2;
            return matches+numberOfMatches((n-1)/2+1);
        }
    }
}
