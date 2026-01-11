package interface_example;

public interface Interface1 {
	public abstract void display();
	public static final int a=5;
	int b=7;
	public abstract void sum();
	public static void show()
	{
		System.out.println("wELCOME");
	}
	default void mul()
	{
		System.out.println("Athira");
	}


}
