package Arrays;
import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter array size");
    int size=s.nextInt();
    int [] a=new int[size];
    for(int i=0;i<a.length-1;i++)
    {
        a[i]=s.nextInt();
    }
    int sum=0;
    for(int i=0;i<a.length-1;i++)
    {
        if(a[i]%2==0)
        sum=sum+a[i];

    }
    System.out.println( "sum of even elements:"+sum);
    
    
    
    }  
}

    

