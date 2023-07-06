
import java.util.ArrayList;
import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,6,6,6,7,7,7,8,8};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(nums,target)));

    }
    static int[] searchRange(int[] nums, int target) {
        int [] ans = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0] = start;
        ans[1]=end;
        return ans;
        }
//Basically the idea over here is run binary search twice .
    //1st for find the 1st occurrence then last .

    static int search(int [] nums , int target , boolean findStartIndex){
        int ans = -1;
        int start = 0 ;
        int end = nums.length-1;
        while (start <= end){
            //finding the mid
            int mid = start + (end-start)/2;
            if (target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid -1;
            }else {
                //Here find my potential ans.
                ans = mid;
                if(findStartIndex){
                    end = mid -1;
                }else {
                    start = mid +1;
                }
            }
    }
        return ans;
}
}
//LeetCode 34 facebook question using binary search.
