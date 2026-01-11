package encapsulation;

public class ChildEncap {

	public static void main(String[] args) {
		ParentEncap p1=new ParentEncap();
		p1.setName("Athira");
		System.out.println("Name is "+p1.getName());
		p1.setAge(35);
		System.out.println("Age is "+p1.getAge());

	}

}
