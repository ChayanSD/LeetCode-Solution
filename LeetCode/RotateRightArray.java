class Solution {
    public void rotate(int[] nums, int k) {
    //avoid the unnecessary execution because if you rotate the 5 time that means 5%5 = 0 you will get the same array.
      //if k is negative then k will be k+length of the array.
       k = k%nums.length;
        if(k<0){
            k = k+nums.length;
        }

        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        
    }
    public void reverse(int [] nums,int start , int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]= temp;
            start++;
            end--;
        }

    }
}
//Split the array in 2 parts with reverse.
//1.Reverse the entire array 0 till last
//2.reverse 1 part that is 0 till k-1;
//3.reverse 2 nd part that is k to last .
