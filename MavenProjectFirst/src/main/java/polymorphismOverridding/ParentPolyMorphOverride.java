package polymorphismOverridding;

public class ParentPolyMorphOverride {
	public void show(int a,int b)
	{
		int diff=a-b;
		System.out.println("DIFF from parent= "+diff);
	}
	public int displaymul(int a,int b)
	{
		int mul=a*b;
		return mul;
		
	}
    public void div(int a,int b)
    {
    	int div=a/b;
    	System.out.println("Division from parent "+div);
    }
}
