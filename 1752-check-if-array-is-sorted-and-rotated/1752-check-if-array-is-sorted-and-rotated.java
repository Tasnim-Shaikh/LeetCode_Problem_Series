class Solution {
    public boolean check(int[] nums) {
        // int arr[]=new int[nums.length];
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=nums[i];
        // }
        // Arrays.sort(arr);
        // int j=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==nums[(i+j)%arr.length]){
        //         return true;
        //     }
        //     j++;
        // }
        // return false;
        int n=nums.length;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
        }
        if(count>1)
            return false;
        else
            return true;
    }
}