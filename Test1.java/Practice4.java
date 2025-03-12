import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int reverse = 0;
        while(number != 0){
            int digits= number % 10;
            reverse=reverse *10 + digits;
            number=number /10;
        }
        System.out.println("reverse="+reverse);
    }
}
