import java.util.Scanner;
class PrintString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            
        System.out.print(s.charAt(i));
        }
        
    }
}