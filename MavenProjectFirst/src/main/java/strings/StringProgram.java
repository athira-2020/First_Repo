package strings;

public class StringProgram {

	public static void main(String[] args) {
		String s="Hello";
		String s1 =new String("Hai athira");
		System.out.println(s);
		System.out.println(s1);
		//length()-to find length of strings
		System.out.println(s1.length());
		//contains()-check whether a character is present on string,return true if value,character is presence else false
		System.out.println(s1.contains("age"));
		//concat()-combine two strings,add 1 string at the end of another
		System.out.println(s1.concat(s));
		System.out.println(s1);
		//charAt()-to return the  character of the string based on index
		System.out.println(s1.charAt(4));
		String g="Hello";
		String m="hello";
		String t="NAME";
		String u="";
		//equals()-to check whether the 2 string is equal or not,if equal return true else false
		System.out.println(s.equals(g));
		System.out.println(g.equals(m));
		System.out.println(m.equals(t));
		//equalsIgnorCase()-to ignore case not content,true return if same
		System.out.println(g.equalsIgnoreCase(m));
		//toUpperCase()-to change or convert  lowercase letters to capital
		System.out.println(m.toUpperCase());
		//toLowerCase()-to convert upper case to lower case
		System.out.println(m.toLowerCase());
		//isEmpty()-to check the string is empty or not,if empty true return
		System.out.println(t.isEmpty());
		System.out.println(u.isEmpty());
		//valueOf()-to convert any datatype to string
		int a=10;
		System.out.println(String.valueOf(a));
		//trim()-remove the leading and trailing spaces from a string
		String k=" hi this is a code ";
		System.out.println(k.trim());
		System.out.println(s==g);//return true because it is literal
		System.out.println(s.equals(g));
		String d =new String("Hello");
		System.out.println(s.equals(d));//returns true because it check content
		System.out.println(s==d);//if we use "equal" operator it checks the objects reference so it is false
		String o =new String("Hello");
		System.out.println(d==o);//return false because it store in different memory location
	}

}
