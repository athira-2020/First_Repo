package StringProgram;

public class BufferBuilder {

	public static void main(String[] args) {
		StringBuffer sbuff =new StringBuffer("Hello World");
		System.out.println(sbuff);
		StringBuilder sbuild = new StringBuilder("Hi");
		System.out.println(sbuild);
		//insert()-to insert anything in string based on index position
		sbuff.insert(6, "morning");
		System.out.println(sbuff);
		//append()-to add new string at last
		sbuff.append("evening");
		System.out.println(sbuff);
		//replace()-to repace a particular word or string based on index position so we give index of start and end
		sbuff.replace(6, 13, "Complete");
		System.out.println(sbuff);
		//reverse()-to find reverse of string
		sbuild.reverse();
		System.out.println(sbuild);
		//delete()-to delete variable based on index position
		sbuff.delete(6, 14);
		System.out.println(sbuff);
		
		

	}

}
