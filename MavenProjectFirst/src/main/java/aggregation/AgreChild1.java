package aggregation;

public class AgreChild1 {
	String fruitimportplace;
	int price;
	AgreParent1 Ref;
	public AgreChild1(String fruitimportplace,int price,AgreParent1 Ref)
	{
		this.fruitimportplace=fruitimportplace;
		this.price=price;
		this.Ref=Ref;
	}
	public void display()
	{
		System.out.println("Fruit is "+Ref.fruitname+", Quantity = "+Ref.quantity);
		System.out.println("Fruit imported from "+fruitimportplace+", Fruit price is "+price);	
	}
	public static void main(String[] args) {
		AgreParent1 a=new AgreParent1("Apple",10);
		AgreChild1 a1=new AgreChild1("India",100,a);
		a1.display();
		
		// TODO Auto-generated method stub

	}

}
