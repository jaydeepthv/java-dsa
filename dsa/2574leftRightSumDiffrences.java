class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left[] =new int[nums.length];
        int right[] =new int[nums.length];
        for(int i = 0;i<nums.length; i++){
            for(int j = 0; j<i; j++){
                left[i] += nums[j];
            }
        }
        for(int i = 0;i<nums.length; i++){
            for(int j = i+1; j<nums.length ;j++){
                right[i] += nums[j];
            }
        }
        int ans[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(left[i] < right[i]){
                ans[i] = right[i] - left[i];
            }else{
                ans[i] = left[i] -right[i];
            }
        }
        return ans;
    }
}
