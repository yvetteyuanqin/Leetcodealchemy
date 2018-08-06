class NumArray {
    int[] subsum;
    public NumArray(int[] nums) {
        this.subsum = new int[nums.length];
        if(nums.length>0){
            subsum[0]=nums[0];
        
        for(int i=1;i<nums.length;i++){
            subsum[i]=subsum[i-1]+nums[i];
        }
        }
        
    }
    
    public int sumRange(int i, int j) {
        return  i==0 ? subsum[j] : subsum[j]-subsum[i-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */