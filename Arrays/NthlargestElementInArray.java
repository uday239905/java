
import java.util.*;
public class NthlargestElementInArray {
    public static void main(String[] args) {
        
    
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int size=sc.nextInt();
        int [] a=new int[size];
        for(int i=0;i<=a.length-1;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("which largest emelent you want");
        int n=sc.nextInt();
        int nle=Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<=a.length-1;i++)
        {
            int le=Integer.MIN_VALUE;
            for(int j=0;j<=a.length-1;j++)
            {
                if(a[j]>le && a[j]<nle)
                {
                le=a[j];
                }
            }
            nle=le;
            count++;
        }
           
            if(count==n)
            {
            
            
            System.out.println("nth largest element is :"+n);
            

            }
            else{
                System.out.println("invalid");

            }
            

                
            
            
        
    }

    
}
