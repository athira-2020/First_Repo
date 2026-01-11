package interface_example;

public class ChildInterface implements multipleparent1,multipleparent2 {

	public static void main(String[] args) {
		ChildInterface C1=new ChildInterface();
		C1.display();
		C1.show();
		

	}

	@Override
	public void display() {

System.out.println("hELLO");
		
	}

	@Override
	public void show() {
		System.out.println("wORLD");
		
	}

}
