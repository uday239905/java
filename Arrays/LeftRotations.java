import java.util.*;
public class LeftRotations {
    public static int[] Rotation(int []a,int n)
    {
        for(int x=0;x<=n;x++)
        {
            int temp=0;
            for(int j=1;j<=a.length-1;j++)
            {
                a[j-1]=a[j];
            }
                a[a.length-1]=temp;
        }
        return a;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int size=sc.nextInt();
        int []a=new int[size];
        for(int i=0;i<=a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("how many rotations u want");
        int n=sc.nextInt();
        
        System.out.println(Arrays.toString (Rotation(a,n)));
        
        
    }
    
}
