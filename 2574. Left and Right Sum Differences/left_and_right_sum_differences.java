class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int len=nums.length;
        int []left=new int[len];
        int []right=new int[len];
        int []res=new int[len];
        left[0]=0;right[len-1]=0;
        for(int i=1;i<=len-1;i++)
            left[i]=left[i-1]+nums[i-1];
        for(int i=len-2;i>=0;i--)
            right[i]=right[i+1]+nums[i+1];
        for(int i=0;i<len;i++)
            res[i]=Math.abs(left[i]-right[i]);
        return res;
        
    }
}
