import java.util.Scanner;
public class JAVA_LOOPING {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("Enter your number:");
		int c = sc.nextInt();
		for (a=0;a<c;a++) {
			for(b=1;b<=a;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

		
		


