//package algorithm;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.HashSet; fff
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Set;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;
//
//import javax.sound.midi.Soundbank;
//
//import sun.security.action.GetBooleanAction;
//
//
//public class EqualPairs {
//
//	public static void main(String[] args) {
////	    Integer[] firstListOfNum = {1,2,3,4,5};
////	    Integer[] secondListOfNum = {6,7,3,8,9,10};
////		
////		List<Integer> firstList = Arrays.asList(firstListOfNum);
////		List<Integer> secondList = Arrays.asList(secondListOfNum);
////		boolean thereEqualPairs = isThereEqualPairs(firstList, secondList);
////		System.out.println(thereEqualPairs);
////		
////		 Character[] firstListOfChar = {'a','b','c','d'};
////		    Character[] secondListOChar = {'r','f','v','x'};
////		    List<Character> firstListChar = Arrays.asList(firstListOfChar);
////			List<Character> secondListChar = Arrays.asList(secondListOChar);
////			
////		    boolean thereEqualPairsBetterSolution = isThereEqualPairsBetterSolution(firstListChar, secondListChar);
////		System.out.println(thereEqualPairsBetterSolution);
//	    
//	    
//	    
//	    
//	    
////	    System.out.println(reverseString("Aysan is here and having fun"));
//	    int[] arrayOne ={10,10,20, 20, 30, 40};
////	    int[] arrayTwo = {10, 20, 80, 100};
////	    System.out.println(mergeArrays(arrayOne, arrayTwo));
//	    System.out.println("first recuring number in this array is: "+ firstRecurringNum(arrayOne));
//	    
//		
//		
//		
//
//	}
//	/*
//	 * Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * */	
//	
//	
//	public static Integer firstRecurringNum(int[] array) {
//	    if (array.length<1) {
//		System.out.println("Please enter a valid input");
//		return 0;
//	    }
//	    List<String> reverse = new ArrayList<String>();
//	    List<String> linkedlist = new LinkedList<String>();
//	    Iterator< String> iteratprIterator = linkedlist.iterator();
//	    while (iteratprIterator.hasNext()) {
//		reverse.add((String) iteratprIterator.next());
//		}
//	    }
//
//	    Set<Integer> set = new HashSet<Integer>();
//	    
//	    for (int i = 0; i < array.length; i++) {
//		if (set.contains(array[i])) {
//		    return array[i];
//		}else {
//		    set.add(array[i]);
//		}
//	    }
//	    if (set.size()==array.length) {
//		System.out.println("all the elements in the array are unique");
//	    }
//	    return null;
//}
//
//	public static boolean arraySum(int[] array, int sum) {
//	    List<Integer> asList = new ArrayList<Integer>(array.length);
//	    for (int i = 0; i < array.length; i++) {
//		asList.add(i);
//	    }
//	    
//	    Set<Integer> set = new HashSet<Integer>();
//	    List<Integer> conplimentIntegers = new ArrayList<Integer>();
//	    
//	    
//	    for (Integer integer : array) {
//		if (integer>=sum) {
//		    continue;
//		}else if (conplimentIntegers.contains(sum-integer)) {
//		    return true;
//		}else {
//		    conplimentIntegers.add(sum-integer);
//		}
//		
//	    }
//	    return false;
//	    }
//	    
//	
//	
//	
//	public static List<Integer> mergeArrays(int[] arrayOne,int[] arrayTwo) {
//	    if (arrayOne.length<1 && arrayTwo.length<1 ) {
//		System.out.println("Please enter some valid input");
//	    }
//	    List<Integer> mergedArray = new ArrayList();
//	    for (int arr : arrayOne) {
//		mergedArray.add(arr);
//	    }
//	    for (int arr : arrayTwo) {
//		mergedArray.add(arr);
//	    }
//	    List<Integer> collect = mergedArray.stream().collect(Collectors.toList());
//	    Collections.sort(collect);
//	    return collect;
//
//	}
//	
//	
//	public static String reverseString(String stringToBeReversed) {
//	    if (stringToBeReversed.isEmpty()) {
//		System.out.println("Please enter a value for input");
//	    }
//	    
//	    char[] input = stringToBeReversed.toCharArray();
//	    char[] output =  new char[stringToBeReversed.length()];
//	    for (int i=0;i<input.length;i++) {
//		output[i] = input[input.length-(i+1)];
//	    }
//	    String str = new String(output);
//	return str;
//	    
//	}
//	
//	//O(n^2)
//	public static boolean isThereEqualPairs(List<Integer> firstList,List<Integer> secondList) {
//	    
//	    for (Integer integer : secondList) {
//		for (Integer integer2 : firstList) {
//		    if (integer==integer2) {
//			return true;
//		    }
//		}
//	    }
//	    return false;
//	}
//
//public static boolean isThereEqualPairsBetterSolution(List<Character> firstList,List<Character> secondList) {
//	    // position of the element is lower in the alphabet then we brk and don't have to compare all the elements
//	    Set<Character> mergedSet = new HashSet<Character>();
//	    for (int index =0; index<firstList.size();index++) {
//		secondList.set(index+secondList.size(), firstList.get(index));
//	    }
//	    
//	    for (Character karCharacter : firstList) {
//		if (!mergedSet.contains(karCharacter)) {
//		    mergedSet.add(karCharacter);
//		}else {
//		    return true;
//		}
//	    }
//	    return false;
//	}
//
//	
//	
//	
//	
//	
//}
