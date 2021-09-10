import java.util.Scanner;

public class Lesson2{
	public static void main(String[] args){
		System.out.println("Enter your name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		if(name.equals("")){
			System.out.println("Welcome Everyone");
		}
		else{
			System.out.println("Welcome " + name);
		}
		
	}

}