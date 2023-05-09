package codingproblems;

public class Factorial {

    public static void main(String[] args) {
	System.out.println(factorialRecursion(1));

    }
    public static Integer factorial(int num) {
	int res=1;
	if (num==0) {
	    return 0;
	}
	while(num>0) {
	    res=res*num;
	    num--;
	}
	return res;
	}
    
    public static Integer factorialRecursion(int num) {
	if (num==0) {
	    return 0;
	}
	if (num==1) {
	    return 1;
	}
	
	return num* factorial(num-1);
	
    }

}
