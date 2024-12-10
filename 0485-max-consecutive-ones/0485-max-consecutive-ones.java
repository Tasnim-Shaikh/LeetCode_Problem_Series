class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
               count++;
                
            }
            else{
                list.add(count);
                count=0;
            }
            
        }
        list.add(count);
        int max=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        return max;
    }
}