class Solution {
    public int maxArea(int[] height) {

        //method 2 pointers and both end

        int max = 0;
        int left = 0;
        int right = height.length - 1;
        int l,b,a;

        while(left < right){
            l = Math.min(height[left],height[right]);
            b = right - left;
            a = l*b;
            if(a>max)
            max = a;
            if (height[left]>height[right])
            right--;
            else
            left++;
        }
    return max;
        // method 1 (fail) - O(N2) is not efficent
        // int max = 0;
        // int len = height.length;
        // int l,b,a;
        // for(int i=0;i<len;i++){
        //     for(int j=i+1;j<len;j++){
        //        l = Math.min(height[i],height[j]);
        //        b =  j-i;
        //        a = l*b;
        //        if (max < a){
        //         max = a;
        //     }
        //     }
            
        // }
        // return max;
        
    }
}