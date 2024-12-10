class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                arr.add(0);
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr.get(i);
        }
    }
}