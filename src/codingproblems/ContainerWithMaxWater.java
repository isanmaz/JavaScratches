package codingproblems;

public class ContainerWithMaxWater {

    public static void main(String[] args) {
	// consider the edge cases as well and then submit :)
	int[] input = {1,8,6,2,5,4,8,3,7};
	System.out.println(maxArea(input));

    }
    public static int maxArea(int[] height) {
	int area = 0;
	int res=0;
	int left=0;
	int right = height.length-1;
	while(left<right) {
	    area = Math.min(height[left], height[right]) * (right-left);
	    res= Math.max(res, area);
	if (height[right]>height[left]) {
	    left++;
	}else if (height[left]>height[right]) {
	    right--;
	}else {
	    right--;
	}
	
	}
	
	
	return res;
    }

}
