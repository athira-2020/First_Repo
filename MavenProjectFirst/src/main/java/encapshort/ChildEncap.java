package encapshort;

public class ChildEncap {

	public static void main(String[] args) {
		ParentEncap p1=new ParentEncap();
		p1.setCity("Kollam");
		p1.setPincode(691552);
		System.out.println("City = "+p1.getCity());
		System.out.println("Pin code ="+p1.getPincode());

	}

}
