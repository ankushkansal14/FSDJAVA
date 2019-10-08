// class FullNameException extends RuntimeException
// {
// 	public FullNameException()
// 	{
// 		System.out.println("Not Entered name Correctly");
// 	}
// }

class FullName
{
	public static void main(String[] args) {
		String FirstName="Ankush";
		String LastName="Kansal";
		if(FirstName == " " || LastName == " ")
		{
			throw new FullNameException();
		}
		else
		{
			System.out.println("Valid");
		}
		
	}
}