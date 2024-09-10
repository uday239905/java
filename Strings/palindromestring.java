import java.util.Scanner;
class Palindromestring 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		 String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
		 char ch=s.charAt(i);
		 rev=rev+ch;
		}
		if(s.equals(rev))
			System.out.println("string is a palindrome");
		else
			System.out.println("string is not a palindrome");
		
		
			
		 
		 
		
	}
}
