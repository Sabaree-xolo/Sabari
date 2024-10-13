import java.util.Scanner;

public class Alter {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i+j>=n)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=n;i>=0;i--)
        {
            for(int j=0;j<n;j++)
            {
                if(i+j>=n)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
