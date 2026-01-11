package interface_example;

public class NormalClass implements Interface1{

	public static void main(String[] args) {
		NormalClass n1=new NormalClass();	//object creation and calling
		n1.display();
		Interface1 n2=new NormalClass();//reference creation of interface and calling 
		n2.display();
		n2.sum();
		Interface1.show();
		n1.mul();
		

	}

	@Override
	public void display() {
		System.out.println("Hello");
		
	}

	@Override
	public void sum() {
		int sum=a+b;
		System.out.println("Sum of interface class= "+sum);
		
	}

}
