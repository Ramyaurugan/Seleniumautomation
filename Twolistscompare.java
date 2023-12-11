package week4homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Twolistscompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list1 = new ArrayList<Integer>();
list1.add(3);
list1.add(2);
list1.add(11);
list1.add(4);
list1.add(6);
list1.add(7);
Collections.sort(list1);
System.out.println(list1);

List<Integer> list2 = new ArrayList<Integer>();
list2.add(1);
list2.add(2);
list2.add(8);
list2.add(4);
list2.add(9);
list2.add(7);

Collections.sort(list2);
System.out.println(list2);
//adding the list1 arrays in the list2
boolean duplicate = list1.retainAll(list2);
System.out.println(duplicate);
System.out.println(list1);

//sorting all the elements and print it
//Collections.sort(list2);
//System.out.println(list2);
/*for (int value : list1) {
    for (int item : list2) {
        if (value == item) {
            System.out.println(value);
            break;*/
	

}
}


