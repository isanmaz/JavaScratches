package codingproblems;

public class MaximumSubarray {

    public static void main(String[] args) {
	int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
	int maxSubArray = maxSubArray(nums);
System.out.println(maxSubArray);
    }
    public static int maxSubArray(int[] nums) {
        int max=nums[0];
        int sub=0;
	for (int i = 0; i < nums.length; i++) {
	    if (sub<0) {
		sub=0;
	    }
	    sub=sub+nums[i];
	    if (sub>max) {
		max = sub;
	    }
	}
	
	return max;
    }
}
