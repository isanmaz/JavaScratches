package codingproblems;

import java.awt.image.RescaleOp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public static void main(String[] args) {
	int[] input = {-1,0};
	int[] twoSum = alternative(input , 9);
	
    }
    public static int[] alternative(int[] num, int target) {
	Map<Integer, Integer> indexVsSub = new HashMap<Integer, Integer>();
	List<Integer> resultIntegers = new ArrayList<Integer>();
	int temp = 0;
	for (int i = 0; i < num.length; i++) {
	    temp= target-num[i];
	    if (!indexVsSub.containsValue(temp) ) {
		indexVsSub.put(i,temp);
	    }
	}
	for (int i = 0; i < num.length; i++) {
	    if (indexVsSub.containsValue(num[i])) {
		resultIntegers.add(i+1);
		resultIntegers.add(indexVsSub.get(i)+1);
	    }
	}
	return resultIntegers.stream().mapToInt(Integer::intValue).toArray();
    }

}

















