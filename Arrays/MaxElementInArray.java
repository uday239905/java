import java.util.*;
public class MaxElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int size=sc.nextInt();
        int [] a=new int [size];
        for(int i=0;i<=a.length-1;i++)
        {
            System.out.println("enter array elements:"+i);
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
                
            }
        }
        System.out.println( "maximum value in []a is:"+max);
        
    }
    
}
