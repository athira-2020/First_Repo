package accessSpecifier;

public class AccessspecifierNormal {
	public void publicmethodshow()
	{
		System.out.println("This is a public method");
	}
	private void privatemethodshow()
	{
		System.out.println("This is a private method");
	}
	void defaultmethodshow()
	{
		System.out.println("This is a default method");
	}
	protected void protectedmethodshow()
	{
		System.out.println("This is a protected method");
	}
	public static void main(String[] args) {
		AccessspecifierNormal a1=new AccessspecifierNormal();
		a1.publicmethodshow();
		a1.privatemethodshow();
		a1.defaultmethodshow();
		a1.protectedmethodshow();
		// TODO Auto-generated method stub

	}

}
