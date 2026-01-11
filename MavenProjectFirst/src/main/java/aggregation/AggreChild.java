package aggregation;

public class AggreChild {
	String place;
	int year;
	AggreParent Ref;
	public AggreChild(String place,int year,AggreParent Ref)
	{
		this.place=place;
		this.year=year;
		this.Ref=Ref;
	}

	public void display()
	{
		System.out.println("Place is "+place+" Year is " +year);
		System.out.println("Name is "+Ref.name+" Age is"+Ref.age);
	}
	public static void main(String[] args) {
		AggreParent c=new AggreParent("Athira",15);//always create parent object as first
		AggreChild c1=new AggreChild("Kollam",2015,c);
		c1.display();
		
		// TODO Auto-generated method stub

	}

}
