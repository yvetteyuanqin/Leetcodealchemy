class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList();
                if (numRows==0) return ans;
        List<Integer> sub1= new ArrayList();
        sub1.add(1);
        ans.add(sub1);
        if(numRows==1)   return ans;
        List<Integer> sub2= new ArrayList();
        sub2.add(1);
        sub2.add(1);
        ans.add(sub2);
        if(numRows==2)   return ans;
        
        //start if numRows>2
        for(int i=2;i<numRows;i++){
            List<Integer> sub = new ArrayList();
            sub.add(1);
            for(int j=1;j<i;j++){
                //System.out.println()
                sub.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
            }
            sub.add(1);
            ans.add(sub);
        }
        return ans;
    }
}