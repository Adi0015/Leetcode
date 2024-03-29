class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0 ;
        int end = numbers.length-1 ;
        while (start < end){
            int mid = start + (end-start) /2;
            int sum = numbers[start] + numbers[end] ; 
            if (sum == target){return new int[]{start+1, end+1};}
            else if (sum < target){
                if(numbers[end]+numbers[mid]<target){start = mid +1;}
                else{start++;}
                }
            else{
                if(numbers[start]+numbers[mid]>target){end = mid -1 ;}
                else{end--;}
                }
            
        }
        return new int[]{start+1,end+1};
    }
 
}