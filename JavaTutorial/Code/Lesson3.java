import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter Mathematical Operation [+, -, *, /]: ");
        String operation = sc.next();
        int result = 0;
        switch (operation) {
            case "+":
                result = a + b;
                System.out.println(a + "+" + b + "=" + result);
                break;
            case "-":
                result = a - b;
                System.out.println("A - B = " + result);
                break;
            case "*":
                result = a * b;
                System.out.println("A x B = " + result);
                break;
            case "/":
                float result_f = (float)a/b;
                System.out.println("A / B = " + result_f);
                break;
            default:
                System.out.println("Invalid Operation");
                break;
        }

    }
}