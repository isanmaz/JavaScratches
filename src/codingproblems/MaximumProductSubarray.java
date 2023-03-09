package codingproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

public class MaximumProductSubarray {

    public static void main(String[] args) {
	int[] nums = {-1,-2,3}; 
	
	int rray = maxProduct(nums);

    }
    
    public static int maxProduct(int[] nums) {
	int max= 1;
	int min= 1;
	int tempMax = Integer.MIN_VALUE;
	int result=0;
	for (int i = 0; i < nums.length; i++) {
	    tempMax=Math.max(nums[i], tempMax);
	}
	result=tempMax;
	List<Integer> neg = new ArrayList<Integer>();
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i]==0) {
		min=1;
		max=1;
		continue;
	    }
	 
	 int def = max*nums[i];
	 max = Math.max(nums[i]*max, Math.max(nums[i]*min, nums[i]));
	 min = Math.min(def,Math.min(nums[i]*min, nums[i]));
	 result = Math.max(result, max);
	    
	}
		return result;
    }


}
