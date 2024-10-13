import java.util.Scanner;

public class fuck {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i+j>=n-1)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--)
        {
            for(int j=0;j<n;j++)
            {
                if(i+j>=n-1)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
