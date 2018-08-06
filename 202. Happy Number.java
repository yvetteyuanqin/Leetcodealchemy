class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mp = new HashMap();
        ArrayList<Integer > array = new ArrayList();
        
        for(int item: nums1){
            mp.put(item,mp.getOrDefault(item,0)+1);
        }
        for(int item: nums2){
            if(mp.containsKey(item))   {
                array.add(item);
                mp.remove(item);
            } 
        }
        int[] ans = new int[array.size()];
        for(int i=0;i<array.size();i++){
            ans[i] = array.get(i);
        }
        return ans;
    }
}