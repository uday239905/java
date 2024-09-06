package Arrays;
import java.util.Scanner;
public class PrintArray {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
    int size=sc.nextInt();
    int [] a=new int[size];
    
    for(int i=0;i<=a.length-1;i++)
    {
        System.out.println("enter array elements:"+i);
        a[i]=sc.nextInt();
    }
    // for(int i=0;i<=a.length-1;i++)
    // {
    //     System.out.print(a[i]+",");
    // }
    for(int num:a)
    {
        System.out.println (num);
    }
}
}