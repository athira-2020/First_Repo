package superkeyword;

public class ChildMethod extends ParentMethod{
	public void place()
	{
		super.display();
		System.out.println("kOLLAM");
		System.out.println(super.sum(3, 2));
		this.mul();
		
	}
	public void mul()
	{
		int a=2;int b=3;
		int mul=a*b;
		System.out.println(+mul);
	}

	public static void main(String[] args) {
		ChildMethod c1=new ChildMethod();
		c1.place();
		//c1.display();
		// TODO Auto-generated method stub

	}

}
