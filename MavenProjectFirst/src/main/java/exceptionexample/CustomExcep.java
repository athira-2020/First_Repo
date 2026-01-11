package exceptionexample;

public class CustomExcep {

	public static void main(String[] args) throws MyException {
		int age=18;
		if (age>18)
		{
			System.out.println("ELIGIBLE FOR VOTING");
		}
		else
		{
			throw new MyException("Not ELIGIBLE FOR VOTING");
		}


	}

}
