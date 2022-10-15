package algorithm;

import java.util.ArrayList;
import java.util.List;

public class BigO {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		    List<String> name = new ArrayList<String>();
		    name.add("nemo");
		    for (int i = 0; i < 10000; i++) {
		      if (name.contains("nemo")) {
		        System.out.println("found nemo");
		      }

		    }

		    long endTime =System.currentTimeMillis();
		    System.out.println(startTime +  '\n' );
		    System.out.println(endTime +  '\n' );
		    System.out.println(endTime-startTime);

	}

}
