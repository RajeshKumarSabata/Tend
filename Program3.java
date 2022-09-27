import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int c=1;
        int res=1;
        if (x%2!=0)
        {
            for (int i=1; i<=x; i++)
            {
                if (c==i)
                {
                    System.out.print(res+" ");
                    res+=2;c++;
                }
            }
        }
        else {
            for (int i=1; i<x; i++)
            {
                System.out.print(res+" ");
                res+=2;c++;
            }
        }
    }
}
