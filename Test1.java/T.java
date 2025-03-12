import java.util.Scanner;

public class T {
    
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n == 1) {
			System.out.println("Number should be greater than 1");
			return;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println("Given Number is Composite");
				return;
			}
		} //rem =n%i rem==0

		System.out.println("Yes Given Number is Prime");
	}
}

