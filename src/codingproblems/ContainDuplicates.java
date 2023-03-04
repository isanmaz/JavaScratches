package codingproblems;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicates {
/*Given an integer array nums, return true if any value appears at least twice in the array,
 *and return false if every element is distinct.
 * 
 * 
 * 
 * */
    public static void main(String[] args) {
	int[] input = {7,1,5,3,6,4};
	boolean isThereDuplicates = containsDuplicate(input);
	System.out.println(isThereDuplicates);

    }
    public static boolean containsDuplicate(int[] nums) {
	
	Set<Integer> numSet = new HashSet<Integer>();
	for (int i = 0; i < nums.length; i++) {
	    if (numSet.contains(nums[i])) {
		return true;
	    }
		numSet.add(nums[i]);
	}
	
	return false;
    }

}
