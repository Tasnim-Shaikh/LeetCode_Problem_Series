class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
    int j = 0; // Pointer for unique elements
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[j]) { // Compare with the last unique element
            j++;
            nums[j] = nums[i]; // Place the unique element at the next position
        }
    }
    return j + 1; 
    }
}