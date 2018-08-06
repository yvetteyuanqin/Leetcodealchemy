class Solution {
    public int missingNumber(int[] nums) {
        //out of index?
        int ans;
        HashMap <Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
        }
        for(int i =0;i<nums.length+1;i++){
            if(!map.containsKey(i))   return i;    
        }
        return 0;
        //return 0;
        
        // bit manipulation
//         int xorval=nums.length;
//         for(int i =0;i<nums.length;i++){
//             xorval^= nums[i]^i ;
            
//         }
//         return xorval;
        

        
    }
}