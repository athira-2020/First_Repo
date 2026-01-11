package abstraction;

public class NormalClass extends AbstractClass{

	public static void main(String[] args) {
		NormalClass n1=new NormalClass();
		n1.display();
		System.out.println(n1.show());
		n1.sum(5, 5);
		System.out.println(AbstractClass.print(4, 4));
		n1.sub();
		
		//ABSTRCT CLASS REFERENCE CREATION
		AbstractClass n2=new NormalClass();
		n2.sum(2, 2);
		n2.display();
		System.out.println(n2.show());
		//n2.sub() we does not call child class property by creating parent class object or reference.
			}
	
	public void sub()
	{
		int a=5;int b=3;
		int sub=a-b;
		System.out.println("Difference="+sub);
	}
	
	
	@Override
	public void display() {
		System.out.println("Hello");
		
	}

	@Override
	public int show() {
		int a=2,b=4;
		int sum=a+b;
		return sum;
	}
		

	




}
