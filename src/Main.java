import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("affine function");
        System.out.println("-----------------");
        System.out.println("formula: f(x)= a.x + b\n" +
                "\n" +
                "ordered pair-> f(x) and result");


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        int soma = a*x + b;

        System.out.println("The result of the calculation is: " + soma);
        System.out.println("The pairs being ordered: " + soma + ", " + x);

    }
}