import java.util.Scanner;
class CharacterCount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		int alphacount=0;
		int digitcount=0;
		int symbolcount=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if((ch>='A'&& ch<='Z') || (ch>='a'&&ch<='z'))
			{
				alphacount++;
			}
			else if( ch>='0'&&ch<='9')
			{
				digitcount++;
			}
		    else
			{
				symbolcount++;
			}
		}
			System.out.println("alphacount"+alphacount);
			System.out.println("digitcounnt"+digitcount);
			System.out.println("alphacount"+symbolcount);
			
	}
}
