package Arrays;
import java.util.Scanner;
public class Bubblesort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter array size");
        int size=s.nextInt();
        int [] a=new int[size];
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<=a.length-1;i++)
        {
            for( int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
                for(int k=0;k<=a.length-1;k++)
                {
                    System.out.println("array after sorting:"+a[k]);
                }
            }
        }
    }
    
}
