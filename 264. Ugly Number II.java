class Solution {
    public int nthUglyNumber(int n) {
        if (n == 1)  return 1;
        //int min = 0;
        int[] ans = new int[n];
        ans[0]=1;
        int p1=0,p2=0,p3=0;
        for(int i =1;i<n;i++){
     
            ans[i] =Math.min(ans[p1]*2,Math.min(ans[p2]*3,ans[p3]*5));
            if(ans[i] == ans[p1]*2) p1++;
            if(ans[i] == ans[p2]*3) p2++;
            if(ans[i] == ans[p3]*5) p3++;
            
        }
        
        return ans[n-1];
    }
}