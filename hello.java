import java.util.Scanner;
public class hello{
	public static void main(String[] args) {
		System.out.printf("Hello world\n");
		Scanner input = new Scanner(System.in);
		System.out.printf("What is your name? \n");
		String name = input.nextLine();
		System.out.printf("Welcome to the ohio, %s\n", name);

	}
}
