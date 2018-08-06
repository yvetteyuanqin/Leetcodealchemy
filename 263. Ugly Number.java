class Solution {
    public boolean isUgly(int num) {
        if (num==0) return false;
        int[] div = {2,3,5};
        for(int d: div){
            while(num%d==0){
                num/=d;
            }
        }
        return num==1;
    }
}