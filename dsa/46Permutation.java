class Solution {

    void swap(int arr[], int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    void getPerms(int nums[], int idx,List<List<Integer>> ans ){

        if(idx == nums.length){
            List<Integer> permutation = new ArrayList<>();
            for(int n : nums){
                permutation.add(n);
            }
            ans.add(permutation);
            return;
        }

        for(int i = idx ; i< nums.length ; i++){
            swap(nums,i,idx);
            getPerms(nums, idx+1, ans);
            swap(nums,i,idx);

        }
    } 

    public List<List<Integer>> permute(int[] nums) {
       
        List<List<Integer>> ans = new ArrayList<>();

        getPerms(nums, 0,ans);

        return ans;
    }
}
