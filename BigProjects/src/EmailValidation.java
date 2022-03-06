import java.util.Scanner;
public class EmailValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		String array[]= {"deekshathakur@gmail.com","thakur_deeksha@gmail.com","abc@gmail.com"};
		System.out.println("Enter email on which you want to check validation.");
		String str = sc.next();
		if(array[0].equals(str)) {
			System.out.println("Authenticated User");
		}
		else if(array[1].equals(str)) {
			System.out.println("Authenticated User");
		}
		else if(array[2].equals(str))
		{System.out.println("Authenticated User");}
		else {
			System.out.println("You're not an Authenticated User.");
		}

	}

}
