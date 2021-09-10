import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter Mathematical Operation [+, -, *, /]: ");
        String operation = sc.next();
        switch (operation) {
            case "+":
                System.out.println(a + "+" + b + "=" + add(a, b));
                break;
            case "-":
                System.out.println(a + "-" + b + "=" + subtract(a, b));
                break;
            case "*":
                System.out.println(a + "*" + b + "=" + multiply(a, b));
                break;
            case "/":
                System.out.println(a + "/" + b + "=" + divide(a, b));
                break;
            default:
                System.out.println("Invalid Operation");
                break;
        }

    }

    public static int add(int a, int b){
        int result = a + b;
        return result;
    }

    public static int subtract(int a, int b){
        int result = a - b;
        return result;
    }

    public static int multiply(int a, int b){
        int result = a * b;
        return result;
    }

    public static float divide(int a, int b){
        float result = (float)a / b;
        return result;
    }
}
