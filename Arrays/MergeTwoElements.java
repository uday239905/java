import java.util.Scanner;
public class MergeTwoElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int size=sc.nextInt();
        int [] a=new int[size];
        int [] b=new int[size];
        int [] c=new int[a.length + b.length];
        for(int i=0;i<=a.length-1;i++)
        { 
            System.out.println("enter  first array elements:"+i);
            a[i]=sc.nextInt();
        } 
        for(int i=0;i<=b.length-1;i++)
        { 
            System.out.println("enter  second array elements:"+i);
            b[i]=sc.nextInt();
        } 
        for(int i=0;i<=a.length-1;i++)
        {
            c[i]=a[i];
            for(int j=a.length;j<c.length;j++)
            {
                c[(a.length)+i]=b[i];
            }
        }
        for (int i=0;i<c.length;i++)
        {
            System.out.print(c[i] +",");
        }

        
    }
    
}
