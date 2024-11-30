class Solution {
    public int firstMissingPositive(int[] arr) {
        
		for(int i=0;i<arr.length;) {
			int correct=arr[i]-1;
			if(arr[i]<=arr.length && arr[i]>0 && arr[i]!=arr[correct]) {
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
				return i+1;
			}
		}
		return arr.length+1;
	}

    }
