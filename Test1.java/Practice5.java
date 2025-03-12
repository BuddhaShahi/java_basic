
// program 

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        
        int sum =0;
        while(number != 0){
            int digits =  number % 10;
            sum = sum + digits;
            number /= 10;

        }
        System.out.println("sum="+sum);
    }
    
}
