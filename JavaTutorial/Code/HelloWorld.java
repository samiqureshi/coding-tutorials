import java.util.Scanner;

public class HelloWorld {

    // BASIC

    // public static void main(String[] args) {
    // System.out.print("Enter your name: ");
    // Scanner sc = new Scanner(System.in);
    // String name = sc.nextLine();
    // if(name.equals("")){
    // System.out.println("Hello everybody");
    // }
    // else{
    // System.out.println("Hello " + name);
    // }

    // }

    // IF-ELSE
    // public static void main(String[] args) {
    // System.out.print("Enter first number: ");
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // System.out.print("Enter second number: ");
    // int b = sc.nextInt();
    // System.out.print("Enter Math Operation [+, -, *]: ");
    // String op = sc.next();
    // int result = 0;
    // if(op.equals("+")){
    // result = a+b;
    // System.out.println("a" + op + "b" + "=" + result);
    // }
    // else if(op.equals("-")){
    // result = a-b;
    // System.out.println("a" + op + "b" + "=" + result);
    // }
    // else if(op.equals("*")){
    // result = a*b;
    // System.out.println("a" + op + "b" + "=" + result);
    // }
    // else{
    // System.out.println("Invalid Operation");
    // }

    // SWITCH
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter Math Operation [+, -, *]: ");
        String op = sc.next();
        int result = 0;
        switch (op) {
            case "+":
                result = a + b;
                System.out.println("a" + op + "b" + "=" + result);
                break;
            case "-":
                result = a - b;
                System.out.println("a" + op + "b" + "=" + result);
                break;
            case "*":
                result = a * b;
                System.out.println("a" + op + "b" + "=" + result);
                break;
            default:
                System.out.println("Invalid Operation");
                break;

        }
    }

}