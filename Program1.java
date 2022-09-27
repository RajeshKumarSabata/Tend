import java.util.Scanner;

public class Program1 {
    static double num1, num2;
    static double res =0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a : ");
        num1 = s.nextDouble();
        System.out.print("Enter b : ");
        num2 = s.nextDouble();
        System.out.print("Enter the operator (+, -, *, /): ");
        String op = s.next();
        System.out.println(num1+" "+op+" "+num2+" = "+calculate(op));
    }

    public static double calculate(String op)
    {
        switch (op)
        {
            case "+":
                res=num1+num2;
                break;

            case "-":
                res = num1-num2;
                break;

            case "*":
                res = num1*num2;
                break;

            case "/":
                res = num1 / num2;
                break;

            default:
                System.out.println("Wrong Input");
                break;
        }
        return res;
    }

}
