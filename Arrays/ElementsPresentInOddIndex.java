package Arrays;
import java.util.*;
public class ElementsPresentInOddIndex {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size");
    int size=sc.nextInt();
    int [] a=new int[size];
    for(int i=0;i<=a.length-1;i++)
    {
        System.out.println("enter array elements");
        a[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<=a.length-1;i++)
    {
        if(a[i]%2==1)
        {
            sum=sum+a[i];
            System.out.println(sum);

        }
    }

    
}
