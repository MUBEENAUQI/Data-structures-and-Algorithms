class Solution {
    public boolean containsDuplicate(int[] nums) {
         HashSet<Integer> set = new HashSet<>();
        
        // Traverse the array and check for duplicates
        for (int num : nums) {
            if (set.contains(num)) {
                return true;  // Duplicate found
            }
            set.add(num);
        }
        
        return false;  // No duplicates found

        // int l = nums.length;

        // for(int i=0;i<l;i++){
        //     for(int j=i+1;j<l;j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}