package codingproblems;

import java.util.Arrays;

public class SearchRotatedSortedArray {

    public static void main(String[] args) {
	int[] nums = {1};
        System.out.println(search(nums,0));
    }
    //[0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
    public static int search(int[] nums, int target) {
        int left=0;
        int right = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
    	if (nums[left]==target) {
	    return left;
	}
    	left++;
    	if (nums[right]==target) {
	    return right;
	}
	right--;
    }
	return -1;

}
}
