class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int n=arr.length;
        		ArrayList<Integer> list=new ArrayList<Integer>();

        for(int i=0;i<n;) {
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
		for(int i=0;i<n;i++) {
			if(arr[i]!=i+1) {
				list.add(arr[i]);
			}
		}
		return list;
    }
}