package codingproblems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry.Entry;

class ThreeSum{
    
    public static void main(String arg[]) {
	
	int[] input = {0,0,0,0} ;
	System.out.println(threeSum(input));
	
	
	
    }//-4,-1,-1,0,1,2
    public static List<List<Integer>> threeSum(int[] nums) {
	//int[] nums = Arrays.stream(numbers).sorted().distinct().toArray();
	Arrays.sort(nums);
	Set<List<Integer>> result = new HashSet();
	for (int i = 0; i < nums.length; i++) {
	    int left=i+1;
	    int right = nums.length-1;
	    if (left==i) {
		left++;
	    }
	    
	    while (left<right) {
		 
	    if (nums[i] + nums[left]+nums[right]==0) {
		List<Integer> sult = new ArrayList<Integer>();
		sult.add(nums[i]);
		sult.add(nums[left]);
		sult.add(nums[right]);
		result.add(sult);
		while (nums[left]!=nums[left-1]&& left<right) {
		    
		    left++;
		    
		}
}
	    
	    else if (nums[i] + nums[left]+nums[right]>0) {
		right--;
	    }else {
		left++;
	    }
	    }
	    
	    
    
	}
        
	return new ArrayList<List<Integer>>(result);
    }

	
    
    
    
}