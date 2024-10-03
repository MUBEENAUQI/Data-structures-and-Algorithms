class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        int flag=0;
        int[] arr=new int[2];
        for(int i=0;i<l;i++){
            for (int j=0;j<l;j++){
                if(i==j){
                    break;
                }//if
                if(nums[i]+nums[j]==target){
                    flag=1;
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }//if
            }//j for
            if(flag ==1)
            break;
        }//i for
        return arr;
    }
}