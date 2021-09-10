import java.util.Scanner;

public class Assignment1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        System.out.println("The average of the three numbers is: " + average(a, b, c));
    }

    public static float average(int a, int b, int c) {
        float result = 0.0f;
        int sum = a + b + c;
        result = (float)sum/3;
        
        //--------------
        //YOUR CODE HERE
        //--------------
        return result;
    }

    // public static void main(String[] args){
    //     System.out.println("Welcome to XYZ Restaurant");
    //     System.out.println("Menu:");
    //     String[] menu = {"Burger", "Pizza", "Hot Dog", "Sandwich", "Pasta", "Cake"};
    //     for(int i = 0; i < menu.length; i++){
    //         System.out.println(i+1 + ") " + menu[i]);
    //     }
    //     System.out.print("Please make your selection: ");
    //     Scanner sc = new Scanner(System.in);
    //     int selection = sc.nextInt();
    //     System.out.println("You ordered a " + menu[selection-1]);
    //     sc.close();

    // }
}