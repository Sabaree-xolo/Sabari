import java.util.Scanner;

public class Hain {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i+j>=n)
                System.out.print(i+""+j+" ");

            }
            System.out.println();
        }
    }
}
