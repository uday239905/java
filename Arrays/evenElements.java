package Arrays;

import java.util.Scanner;

public class evenElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int size=sc.nextInt();
        int [] a=new int[size];
        for(int i=0;i<=a.length-1;i++)
        {
            System.err.println("enter array elements:"+i);
            a[i]=sc.nextInt();
        }
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]%2==0)
            System.err.println(a[i]);
        }

        
    }
    
}
