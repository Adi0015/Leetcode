class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE ;
        for (int[] account : accounts) {int balance = sum(account) ;if (balance > max){max = balance ;}}
        return max;
  }
    int sum(int[] account){
        int sum = 0;
        for (int num : account){ sum = sum + num ;}
        return sum;
  }
}