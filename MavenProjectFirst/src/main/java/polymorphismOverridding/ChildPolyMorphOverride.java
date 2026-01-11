package polymorphismOverridding;

public class ChildPolyMorphOverride extends ParentPolyMorphOverride{
	public void show(int a,int b)
	{
		super.show(5, 4);
		int sum=a+b;
		System.out.println("SUM from child "+sum);
	}

	public static void main(String[] args) {
		ChildPolyMorphOverride c1=new ChildPolyMorphOverride();
		c1.show(2, 3);
		System.out.println(c1.displaymul(3, 5));
		c1.div(4, 4);
		// TODO Auto-generated method stub

	}

	@Override
	public int displaymul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(super.displaymul(4, 5));
		int mul=a*b;
		return mul;
		
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		super.div(a, b);
		int div=a/b;
		System.out.println("Division of child= "+div);
	}

}
