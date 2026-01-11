package abstraction;

public abstract class AbstractClass {
	public abstract void display();
	public abstract int show();
	public void sum(int a,int b)
	{
		int sum=a+b;
		System.out.println("Sum of 2 numbers ="+sum);
	}
	public static int print(int a,int b)
	{
		int mul=a*b;
		return mul;
	}
	public AbstractClass()
	{
		float a=2;
		float b=3;
		float sum=a+b;
		System.out.println("Sum of abstarct class "+sum);
	}

}
