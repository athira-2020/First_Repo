package exceptionexample;

public class Throwthrows {

	public static void main(String[] args) throws Exception {
		int age=18;
		if (age>18)
		{
			System.out.println("ELIGIBLE FOR VOTING");
		}
		else
		{
			throw new Exception("Not ELIGIBLE FOR VOTING");
		}

	}

}
