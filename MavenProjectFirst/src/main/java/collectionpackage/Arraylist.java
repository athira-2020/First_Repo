package collectionpackage;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Hello");
		ar.add("Good Morning");
		ar.add("Have a Nice day");
		System.out.println(ar);
		
		ArrayList<String> ar1=new ArrayList<String>();
		ar1.add("Hi");
		ar1.add("Welcome");
		ar1.add("To my home");
		System.out.println(ar1);
		
		//addAll()-to add 1 list at the end of another return if true to check add or return print again
		System.out.println(ar1.addAll(ar));
		System.out.println(ar1);
		
		//containsAll()-to check whether a list is present in another list return true if present
		System.out.println(ar1.containsAll(ar));
		
		Iterator <String> iter = ar1.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		iter.remove();//to remove last element
		System.out.println(ar1);
	}

}
