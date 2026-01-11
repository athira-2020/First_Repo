package superkeyword;

public class ChildConstructorr extends ParentConstructorr {
	public ChildConstructorr()
	{
		super(4,3);
		System.out.println("Good Morning");
	}

	public ChildConstructorr(float a,float b)
	{
		super();//if we call or not default constructor in parent is executed
		float sum = a+b;
		System.out.println(+sum);
	}
	
	public static void main(String[] args) {
		ChildConstructorr c1=new ChildConstructorr();
		ChildConstructorr c2=new ChildConstructorr(3.2f,4.5f);
		
				
		// TODO Auto-generated method stub

	}

}
