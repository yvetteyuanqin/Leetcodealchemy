import java.util.*;

public class MaxDivision {
    public int findMaxDivision(int[] A, int n) {
        // write code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,A[i]);
            max=Math.max(max,A[i]);
        }
        int[] bucket = new int[max-min+1];
        for(int i=0;i<n;i++){
            bucket[A[i]-min]++;
        }
        int cnt=0;
        int maxint=Integer.MIN_VALUE;
        for(int i=0;i<bucket.length;i++){
            if(bucket[i]==0)cnt++;
                else {
                    if (cnt>maxint)
                        maxint=cnt;
                    cnt=0;
                }
        }
        return ++maxint;
        
    }
}