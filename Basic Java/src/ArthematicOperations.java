
import java.util.Scanner;
public class ArthematicOperations {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter two Numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Sum="+(a+b));
        System.out.println("Difference="+(a-b));
        System.out.println("Multiplication="+a*b);
        System.out.println("Modulus="+(a%b));
    }


}
