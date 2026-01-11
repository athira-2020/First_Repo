package superkeyword;

public class Child extends Parent{
	String color ="Green";
public void display()
{
	System.out.println(color);
	System.out.println(super.color);
}
	public static void main(String[] args) {
		Child c1=new Child();
		//System.out.println(c1.color);
		c1.display();
		// TODO Auto-generated method stub

	}

}
