package codingproblems;

import java.awt.image.RescaleOp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoSumTwo {

    public static int[] twoSum(int[] numbers, int target) {
        int[] arrayResult = new int[numbers.length];
        int left=1;
        int right=numbers.length;
        List<Integer> reultIntegers = new ArrayList<Integer>();
	int l=0;
	for (int i = 0; i < numbers.length-1; i++) {
	    left = i+1;
	    if (i==numbers.length-1) {
		right=0;
	    }else {
		right = numbers.length-1;
	    }
	    for (int j = i; j < numbers.length-1; j++) {
		if (numbers[j]+numbers[left]==target) {
		    arrayResult[0]=i;
		    arrayResult[1]=left;
		    return arrayResult;
		}else if(numbers[j]+numbers[left]>target) {
		    continue;
		}else {
		    left++;
		}
		if (numbers[j]+numbers[right]==target) {
		    arrayResult[0]=i;
		    arrayResult[1]=right;
		    return arrayResult;
		}else if (numbers[j]+numbers[right]<target) {
		    continue;
		}else {
		    right--;
		}
		
	    }
	}
	return arrayResult;
    }

}

