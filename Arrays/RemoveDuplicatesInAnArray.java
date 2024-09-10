import java.util.Scanner;
public class RemoveDuplicatesInAnArray {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter array Size");
        int size=Sc.nextInt();
        int []a=new int[size];
        for(int i=0;i<a.length;i++)
        {
            a[i]=Sc.nextInt();

        }
        //replace -1 if repeated elements occurs
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    a[j]=-1;
                }
            }
        }
        //count number of repeated elements
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=-1)
            count++;
        }
        int [] b=new int[count];
        int j=0;
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=-1)
            b[j++]=a[i];
        }
        //printing array without duplicates
        for(int i=0;i<b.length;i++)
        {
           System.out.print(b[i]+",");
        }

        
    }
    
}
