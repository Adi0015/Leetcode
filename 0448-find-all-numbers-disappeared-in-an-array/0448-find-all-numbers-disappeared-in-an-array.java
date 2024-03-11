class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0 ;
        while (i < nums.length){
            // [0,1,2,3,4]
            // [5,3,2,6,8]
            int correct =  nums[i] - 1;
            if (nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{i++;}
        }

        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < nums.length ; index ++){
            if (index != nums[index]-1){
                ans.add(index+1);
            }
        }
        return ans;
    }

    public void swap (int[] arr,int first,int last){
        int temp = arr[first];
        arr[first] =  arr[last];
        arr[last] = temp;

    } 
}