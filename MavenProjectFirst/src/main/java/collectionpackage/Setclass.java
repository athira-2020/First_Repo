package collectionpackage;

import java.util.HashSet;
import java.util.Set;

public class Setclass {

	public static void main(String[] args) {
		Set <String> str=new HashSet <String>();
		str.add("Hello");
		str.add("Hi");
		str.add("Hi");
		str.add("Good evening");
		System.out.println(str);//[Hi, Hello, Good evening] set is unordered and not index based not able to save multiple elements
		//addAll
		//containsAll()
		//isEmpty()
		//remove()
		//size()
		System.out.println(str.remove("Hi"));
		System.out.println(str);
		str.clear();
		System.out.println(str);
	}

}
