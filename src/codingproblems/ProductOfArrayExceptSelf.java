package codingproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
	int[] input = {1,2,3,4};
	int[] isThereDuplicates = productExceptSelf(input);
	for (int i = 0; i < isThereDuplicates.length; i++) {
	    System.out.println(isThereDuplicates[i]);
	}

    }
    
 public static int[] productExceptSelf(int[] nums) {
     int[] prefix = new int[nums.length];
     int[] postfix = new int[nums.length];
     int[] output = new int[nums.length];
     int pre=1;
     int post = 1;
     int i =0;
     int j =nums.length-1;
     while (i<nums.length) {
	post=nums[j]*post;
	postfix[j]= post;
	pre= nums[i]*pre;
	prefix[i]=pre;
	i++;
	j--;
    }
     for (int k = 0; k < nums.length; k++) {
	if (k==0) {
	    output[k] = postfix[k+1];
	    continue;
	}
	if (k==nums.length-1) {
	    output[k] = prefix[k-1];
	    continue;
	}
	output[k] = prefix[k-1]*postfix[k+1];  
    }
    
    return output;
        
    }

}
