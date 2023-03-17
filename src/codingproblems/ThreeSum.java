//package codingproblems;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import com.sun.org.apache.regexp.internal.recompile;
//
//import javafx.util.Pair;
//
//public class ThreeSum {
//
//    public static void main(String[] args) {
//	// TODO Auto-generated method stub
//
//    }
//    public static List<List<Integer>> threeSum(int[] nums) {
//	List<List<Integer>> result = new ArrayList<List<Integer>>();
//	if (nums.length<3) {
//	    return Collections.emptyList();
//	}
//	List<Integer> subs= new ArrayList<Integer>();
//	int l=0;
//	int r=1;
//	Map< Integer,Pair<Integer, Integer>> pairVsSub= new HashMap<Integer,Pair<Integer,Integer>>();
//	for (int i = 0; i < nums.length; i++) {
//	    int left= i+1;
//	    int right=i+2;
//	    int temp= nums[left]+nums[right];
//	    if (subs.contains(temp*(-1))) {
//		List<Integer> subArray= new ArrayList<Integer>();
//		subArray.add(l);
//		subArray.add(r);
//		Pair<Integer, Integer> leftRight = new Pair<Integer, Integer>(l, r);
//		subArray.add(pairVsSub.get(leftRight));
//	    }else {
//		Pair<Integer, Integer> leftRight = new Pair<Integer, Integer>(l, r);
//		pairVsSub.put(leftRight, temp*(-1));
//	    }
//	}
//	
//	return null;
//    }
//
//}
