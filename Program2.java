import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int c=1;
        int res=1;
        for (int i=1; i<=x; i++)
        {
            if (c==i)
            {
                System.out.print(res+" ");
                res+=2;
                c++;
            }
        }
    }
}
