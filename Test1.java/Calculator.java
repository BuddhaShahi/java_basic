import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        
        System.out.println("Enter the choice number\n1. Addition \n2.Subtraction\n 3.Divition \n 4.Multiplicaiton");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        System.out.println("Enter two number");

        int a= sc.nextInt();
        int b=sc.nextInt();
        int c;
        sc.close();

        switch (choice) {
            case 1:
                c=a+b;
                System.out.println("Addition=" +c);
                break;
            case 2:
                c=a-b;
                System.out.println("Subtraction=" +c);
                break;
            case 3:
                c=a/b;
                System.out.println("Division= " + c);
                break;

            case 4:
                c=a*b;
                System.out.println("Multiplication=" +c);

                
                break;
        
            default:
                System.out.println("Invalid options");
                break;
        }




    }









}
