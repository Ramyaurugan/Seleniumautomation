package week4homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arraylist {

	
	public static void main(String[] args) {
		List<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(10);
		array.add(6);
		array.add(8);
		System.out.println(array);
		Collections.sort(array);
		System.out.println(array);
		for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i) + 1 != array.get(i + 1)) { // Check for gap in sequence
                int missing = array.get(i) + 1;
                System.out.println("Missing Element: " + missing);
		}
	}

	}
}
