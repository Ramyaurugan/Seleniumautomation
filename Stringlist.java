package week4homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stringlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 List<String> stlist = new ArrayList<String>();
 stlist.add("HCL");
 stlist.add("Wipro");
 stlist.add("Aspire Systems");
 stlist.add("CTS");
 Collections.sort(stlist);
 System.out.println(stlist);
  for (int i = stlist.size(); i >0 ; i--) {
	System.out.println(stlist.get(i));
	
}
  
  
 
 
	}

}
