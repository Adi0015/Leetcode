class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) { if (even(num)){count++;}}
        return count;  
    }

    public boolean even(int num){
        int digits = 0;
        while (num>0) { digits++; num=num/10; }
        if (digits%2 ==0){return true;}
        else return false ;
  }
}