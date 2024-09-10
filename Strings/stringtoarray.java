import java.util.*;
class StringtoArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a  string");
		String s=sc.nextLine();
		char [] a=new char [s.length()];
		for(int i=0;i<=s.length()-1;i++)
		{
			a[i]=s.charAt(i);
		}
		//char [] a=s.toCharArray(); predefined method to convert string to array
		System.out.println(Arrays.toString(a));
		
			
	}
}

