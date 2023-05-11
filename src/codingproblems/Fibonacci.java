package codingproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fibonacci {
    static List<Integer> result= new ArrayList<Integer>();

    public static void main(String[] args) {
	fibonacci(7);
	System.out.println(result);
	for (int i = 0; i <= 6; i++) {
	    System.out.println(fibonacci(i));
	}

    }
    //0,1,1,2,3,5,8 = n = 2
    public static int fibonacci(int n) {
	if (n==0) {
	    result.add(0);
	    return 0;
	}
	if (n==1) {
	    result.add(0);
	    result.add(1);
	    return 1;
	}
	result.add(fibonacci(n-1)+fibonacci(n-2));
	return fibonacci(n-1)+fibonacci(n-2);

 }

}
