package exceptionexample;

public class exceptionnormal1 {

	public static void main(String[] args) {
		
		//athithemetic exception
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		/*int s=10;int c=0;
		int div=s/c;		
		System.out.println(+c);*/
		try
		{
		int s=10;int c=0;
		int div=s/c;		
		System.out.println(+c);
		}
		catch(ArithmeticException excep)
		{
			System.out.println("eXCEPTION HANDLED");
		}
		finally
		{
			System.out.println("fINALLY BLOCK ALWAYS PRINTED");
		}
		//System.out.println("Hi");
		
		//array index out of bound exception
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
		try
		{int a[]= {1,2,3,4,5};
		for(int i=0;i<=5;i++)
		{
			System.out.println(a[i]);
		}}
		catch(ArrayIndexOutOfBoundsException INDE)
		{
			System.out.println("eXCEPTION HANDLED");
		}
		finally
		{
			System.out.println("fINALLY BLOCK ALWAYS PRINTED");
		}
		
		//Nullpointer exception
		//Exception in thread "main" java.lang.NullPointerException:
		/*String g=null;
		System.out.println(g.length());*/

	}

}
