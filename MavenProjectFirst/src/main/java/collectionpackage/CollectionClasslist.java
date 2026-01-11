package collectionpackage;

import java.util.ArrayList;
import java.util.List;
//examples for methods used in list 
public class CollectionClasslist {

	public static void main(String[] args) {
		List<String>li=new ArrayList<String>();
		System.out.println(li);
		
		//add-to add elements in collection
		li.add("Athira");
		li.add("Hi");
		li.add("Hi");
		li.add(null);
		li.add("Welcome");
		System.out.println(li);
		
		//indexOf()-to return the index of the particular element,always show first occurance,hi is repeated
		System.out.println(li.indexOf("Hi"));
		
		//lastindexOf()-TO RETURN THE LAST INDEX OF REPEATED ELEMNT
		System.out.println(li.lastIndexOf("Hi"));
		
		//remove-to remove the particular amount from list by using index number and display the deleted elemnt
		System.out.println(li.remove(3));
		System.out.println(li);
		
		//get-to get or fetch element from a list
		System.out.println(li.get(3));
		
		//contains()-to check element is present or not in list,return if true
		System.out.println(li.contains("Welcome"));
		
		//size()-to find the length of list or collection
		System.out.println(li.size());
		
		//isEmpty()-to check the list empty or not
		if(li.isEmpty())
		{
			System.out.println("List is empty");
		}
		else
		{
			System.out.println("List is not empty");
		}
		
		//it iterate element
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		
		//iterate using for each loop
		//for(datatype variablename:collection name/array name)
		for(String i:li)
		{
			System.out.println(i);
		}
	}

}
