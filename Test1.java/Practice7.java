import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);

        int number = sc.nextInt();

        sc.close();

        if (number % 5 ==0 && number %11 == 0) {

            System.out.println("The number is divisible by 5 and 11 \n" + number);

            
        } else {
            
            System.out.println("The number is not divisible by 5 and 11\n" + number);
        }

    }    
}
