package accessSpecifier;

public class AccessspecifierClass extends AccessspecifierNormal {

	public static void main(String[] args) {
		AccessspecifierClass a1=new AccessspecifierClass();
		a1.protectedmethodshow();
		a1.publicmethodshow();
		a1.defaultmethodshow();
		//a1.privatemethodshow();not accessible from outside the class
		// TODO Auto-generated method stub

	}

}
