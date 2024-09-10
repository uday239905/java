import java.util.Scanner;
public class compairingtwostrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string");
        String s1=sc.nextLine();
        System.out.println("enter second  string");
        String s2=sc.nextLine();
        boolean issame=true;
        if(s1.length()==s2.length())
        {
            System.out.println("strings are not same because of lengths");
        }
        else
        {
            for(int i=0;i<=s1.length()-1;i++)
            {
                if(s1.charAt(i)==s2.charAt(i))
                {
                  issame=false;
                  break;
                }
            }
        }
        if(issame)
        {
            System.out.println("strings are same");
        }
        else
        {
            System.out.println("strings are not same");
        }



        
    }
    
}
