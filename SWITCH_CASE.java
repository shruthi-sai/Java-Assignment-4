package vowels;
import java.util.Scanner;
public class SWITCH_CASE {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the alphabet:");
			char c = sc.next().charAt(0);
			switch(c) {
			case 'a': System.out.println("Is a vowel");
			break;
			case 'e': System.out.println("Is a vowel");
			break;
			case 'i': System.out.println("Is a vowel");
			break;
			case 'o': System.out.println("Is a vowel");
			break;
			case 'u': System.out.println("Is a vowel");
			break;
			default: System.out.println("Is a consonant");
			}
		}

	}

}
