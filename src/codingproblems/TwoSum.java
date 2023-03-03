package codingproblems;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 * 
 * 
 * 
 * */

public class TwoSum {

    public static void main(String[] args) {
	int[] input = {2,7,11,15};
	int[] twoSum = twoSum(input, 9);
	for (int i : twoSum) {
	    System.out.println(i);
	}

    }
   public static int[] twoSum(int[] nums, int target) {
    Map<Integer,Integer> subs = new HashMap<Integer, Integer>();
    List<Integer> pairIntegers = new ArrayList<Integer>();
           for (int i = 0; i < nums.length; i++) {
	if (subs.containsKey((nums[i]))) {
	    pairIntegers.add(i);
	    pairIntegers.add(subs.get(nums[i]));
	    return pairIntegers.stream().mapToInt(j->j).toArray();
	}
	subs.put(target-nums[i], i);
	
    }
	return null;
   }

}
