package Classfiles;


public class InvalidUserException extends RuntimeException 
{

	public InvalidUserException() 
	{
		System.out.println("Entered user does not exist");
	}
}
