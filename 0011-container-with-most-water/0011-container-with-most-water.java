class Solution {
    public int maxArea(int[] height) {
        int a_pointer = 0;
        int b_pointer = height.length-1;
        int res = 0;
        while(b_pointer>a_pointer)
        {
            int a = Math.min(height[a_pointer],height[b_pointer])*(b_pointer-a_pointer);
            res = Math.max(res,a);
            if(height[a_pointer]>height[b_pointer]){
            b_pointer--;}
            else{
            a_pointer++;}
        }
        return res;
    }
}