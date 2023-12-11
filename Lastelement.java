package week4homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lastelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> array = new ArrayList<Integer>();
		array.add(3);
		array.add(2);
		array.add(11);
		array.add(4);
		array.add(6);
		array.add(7);
		Collections.sort(array);
		System.out.println(array);
		System.out.println(array.get(4));
	}

}
