package codingproblems;

public class MinimumInRotatedSortedArray {

    public static void main(String[] args) {
	int[] nums = {3,4,5,1,2};
	System.out.println(findMin(nums));

    }

    
    public static int findMin(int[] nums) {
	int min=nums[0];
	int right=nums.length-1;
	if (nums[0]<nums[nums.length-1]) {
	    return nums[0];
	}
	for (int i = 0; i < nums.length; i++) {
	  if (nums[right]<min && right <=nums.length-1) {
	    min=nums[right];
	      right--;
	}
	  
}
	
	return min;
    }
    

}
