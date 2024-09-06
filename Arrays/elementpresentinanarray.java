package Arrays;
import java.util.Scanner;

public class elementpresentinanarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.err.println("enter array size");
        int size=s.nextInt();
        int [] a=new int[size];
        for(int i=0;i<=a.length-1;i++)
        {
            System.err.println("enter array elements:"+i);
            a[i]=s.nextInt();
        }
        System.out.println("which element do you want");
        int n=s.nextInt();
        boolean ispresent=false;
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]==n)
            {
            ispresent=true;
            break;
            }
           
        }
        if(ispresent)
        {
            System.out.println("element is present :");
        }
        else{
            System.out.println("element is not found");
        }
        





    }
    
}
