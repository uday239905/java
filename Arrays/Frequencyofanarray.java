import java.util.*;
public class Frequencyofanarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eter array size");
        int size=sc.nextInt();
        int [] a=new int[size];
        int [] f=new int[a.length];
        int check=-1;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }    
        for(int i=0;i<a.length;i++)
        {
            int count=0;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    f[j]=check;
                }
            }

        }
        for(int i=0;i<a.length;i++)
        {
            if(f[i]!=check)
            {
                System.out.print(a[i]+",");
            }
        }
            
    }
    
}
