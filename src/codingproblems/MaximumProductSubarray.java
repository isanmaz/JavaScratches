package codingproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumProductSubarray {

    public static void main(String[] args) {
	int[] nums = {3,-1,4};
	
	int rray = maxProduct(nums);

    }
    
    public static int maxProduct(int[] nums) {
	int def=1;
	int max= nums[0];
	int left=0;
	int right=1;
	for (int i = 0; i < nums.length; i++) {
	    def=def*nums[i];
	    if (def>0) {
		max=def;
	    }else if(def<0) {
		if (max<0 && max<def) {
		    max=def;
		}else {
		    def=1;
		}
		
	    }else {
		def=1;
		if (max<0) {
		    max=0;
		}
	    }
	}
		return max;
    }

}
