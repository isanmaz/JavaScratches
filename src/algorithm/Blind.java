package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sound.midi.Soundbank;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

import sun.security.util.Length;

public class Blind {

    public static void main(String[] args) {
	//factorial(5);
	//System.out.println(recursiveFactorial(5));
	//System.out.println(fibotachi(5));
	int[] input = {8,-19,5,-4,20};
	int[] arraySum = arraySum(input ,4);
	//System.out.println(Arrays.toString(arraySum));
	//System.out.println(bestTime(input));
	//productExceptSelf(input);
	System.out.println(maxSubArray(input));
	

    }
    /*
     * Input: nums = [4,5,6,7,0,1,2], target = 0
       Output: 4
     * 
     * 
     * */
    public static int search(int[] nums, int target) {

	int mid=0;
	int result=0;
	int left=0;
	int right =nums.length-1;
	//array is not rotated
	while (left<right) {
	    mid = left+right/2;
	    if (nums[mid]==target) {
		return mid;
		//go to the right
	    }else if (target>nums[mid]) {
		left= mid;
	    }else if (target<nums[mid]) {
		right = nums[mid];
	    }
	}
	
	
	
	if (left<right) {
    if (target>mid) {
	
    }
    
}
	
	
	return target;
        
    }
    
 public static int maxSubArray(int[] nums) {
     int max= nums[0];
     int subSum=0;
     List<Integer> subarrays= new ArrayList<Integer>();
     for (int i = 0; i < nums.length; i++) {
	if (nums[i]>max) {
	    max = nums[i];
	}
	}
     subSum=0;
     for (int i = 0; i < nums.length; i++) {
	 if (subSum<0) {
	    subSum=0;
	}
subSum = subSum+nums[i];
if (subSum>max) {
    max=subSum;
}
    }
     return max;   
    }
    
    
    
    
    //Input: nums = [1,2,3,4]
    //Output: [24,12,8,6]
    public static int[] productExceptSelf(int[] nums) {
	int[] answer = new int[nums.length];
	int[] post = new int[nums.length];
	int[] pre = new int[nums.length];
        int midResultPre = 1;
        int midResultPost = 1;
        int j = answer.length-1;
        
        for (int i = 0; i < answer.length; i++) {
            //[1,2,6,24]
            if (i==0) {
		pre[i] = 1;
		
	    }else {
		midResultPre= midResultPre*nums[i-1];
		pre[i] = midResultPre;
		
	    }
            if (j==answer.length-1) {
		post[j] = 1;
	    }else {
		midResultPost = midResultPost*nums[j+1];
		post[j] = midResultPost;
	    }
            
	j--;
	//answer[i] = midResultPost*midResultPre;
        }
        for (int i = 0; i < nums.length; i++) {
	    answer[i] = post[i]*pre[i];
	    System.out.println(answer[i]);
	}
        
	return answer ;
    }
    
    
    
 public boolean containsDuplicate(int[] nums) {

     Set<Integer> dups = new HashSet<Integer>();
     for (int i = 0; i < nums.length; i++) {

	 if (dups.contains(nums[i])) {
	    return true;
	}
	 else {
	    dups.add(nums[i]);
	}
    }
     
     
     return false;
        
    }
    //[7,1,5,3,6,4]
    //dif of each element should be calculated
    public static Integer bestTime(int[] prices) {
	if (prices.length<1) {
	    System.out.println("Please enter a valid input");
	    return 0;
	}
	int sell = prices[prices.length-1];
	int profit =0;
	int buy=prices[0];
	int buyIndex=0;
	int sellIndex=prices.length-1;
	
	
	for (int i = 0; i < prices.length; i++) {
	    if (prices[i]<buy) {
		buy = prices[i];
	    }
		else if (prices[i]-buy > profit) {
		    profit = prices[i]-buy;
		}
	    }
	      
	return profit;
	}
	
    
    
    
    
    
//Big(O) = O(n)        
public static int[] arraySum(int[] input,int sum) {
    int[] result = new int[input.length];
    List<Integer> resultsList = new ArrayList<Integer>();
    List<Integer> comp = new ArrayList<Integer>();
for (int i = 0; i < input.length; i++) {
if (comp.contains(sum-input[i])) {
    comp.add(i);
}else {
    comp.add(sum-input[i]);
}
    }
    
    for (int i = 0; i < input.length; i++) {
	if (comp.contains(input[i])) {
	result[i] = i;
	    resultsList.add(i);
	}
    }   
if (result.length<1) {
    System.out.println("None of the elemets in the list sum up to the target");
}
return result;   
}
    public static Integer factorial(int n) {
	if (n==0 || n==1|| n==2) {
	    return n;
	}
         int m = 1;
	while (n>1) {
	    m= m*n;
	    n=n-1;
	}
	return m;
    }
    public static Integer recursiveFactorial(int n) {
	if (n<=2) {
	    return n;
	}
	if (n==2) {
	    return 2;
	}
      return	n* recursiveFactorial(n-1);
	
    }
    public static Integer fibotachi(int n) {
	//0,1,1   
	//n=2 >> index[n]
	int fibo[] = new int[n+1]; 
	fibo[0] = 0;
	fibo[1] =1;
	for (int i = 2; i < fibo.length; i++) {
	    fibo[i] = fibo[i-2] + fibo[i-1];
	}	
	return fibo[n];
    }

}
