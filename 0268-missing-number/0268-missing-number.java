class Solution {
    public int missingNumber(int[] nums) {
        int [] arr = new int[nums.length +1] ;
        Arrays.fill(arr, -1);

        for (int i = 0 ; i < nums.length ; i++){
            int correct = nums[i];
            arr[correct] = correct ;

        }
        for (int i = 0; i < arr.length; i++) {
          if (arr[i]!=i) {return i;}
        }
        return -1;
    }
        
        
}