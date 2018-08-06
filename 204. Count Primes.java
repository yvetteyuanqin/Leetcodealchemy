class Solution {
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int cnt =0;
        if(n<=1)    return 0;
        
        for(int i=2;i<n;i++){
            if(!notPrime[i]){//if the i th number is prime
                cnt++;//increment cnt
                for(int j = 2;i*j<n;j++){
                    notPrime[i*j] = true;
                }
            }
        }
        
        return cnt;
    }
}