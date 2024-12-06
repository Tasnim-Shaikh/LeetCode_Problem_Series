class Solution {
    public boolean isPalindrome(String s) {
        
       StringBuilder builder1=new StringBuilder();
        String lower=s.toLowerCase();
        for(int i=0;i<lower.length();i++){
            char ch=lower.charAt(i);
            if(ch>='a'&&ch<='z' || ch>='0'&&ch<='9'){
                builder1.append(ch+"");
            }
        }
        StringBuilder origin=new StringBuilder();
        origin.append(builder1);
        builder1.reverse();
        if(builder1.toString().equals(origin.toString())){
            return true;
        }
        return false;
    }
}