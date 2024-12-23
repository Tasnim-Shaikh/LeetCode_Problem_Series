class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int no=x;
        int sum=0;
        while(no>0){
            int rem=no%10;
            sum+=rem;
            no=no/10;
        }
        if(x%sum==0){
            return sum;
        }
        else{
            return -1;
        }
    }
}