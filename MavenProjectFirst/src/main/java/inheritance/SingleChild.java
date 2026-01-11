package inheritance;

public class SingleChild extends SingleParent{
	public void display()
	{
		System.out.println("hI");
	}


	public static void main(String[] args) {
		SingleChild obj = new SingleChild();
				obj.display();
				obj.sum();
				SingleParent obj1 = new SingleParent();
				obj1.sum();
		// TODO Auto-generated method stub

	}

}
