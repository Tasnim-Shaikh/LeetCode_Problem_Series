class Solution {
    public int[] findErrorNums(int[] arr) {
        for(int i=0;i<arr.length;) {
			int correct=arr[i]-1;
			if(arr[i]!=arr[correct]) {
				int temp=arr[i];
				arr[i]=arr[correct];
				arr[correct]=temp;
			}
			else {
				i++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=i+1) {
				return new int[] {arr[i],i+1};
			}
		}
		return new int[] {-1,-1};
    }
}