package modifieraceessspecifier;

import accessSpecifier.AccessspecifierNormal;

public class Accessspecifierclass1 extends AccessspecifierNormal {

	public static void main(String[] args) {
		Accessspecifierclass1 a1=new Accessspecifierclass1();
		a1.protectedmethodshow();
		a1.publicmethodshow();
		//a1.defaultmethodshow();csnnot be call outside the package
		// TODO Auto-generated method stub
		
		AccessspecifierNormal c1=new AccessspecifierNormal();
		c1.publicmethodshow(); 
		//a1.protectedmethodshow();we cannot call protected outside the class by using child we can call that one
	}

}
