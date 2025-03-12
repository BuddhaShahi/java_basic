import java.util.Scanner;

public class PracticeAmst {

    public static void main( string[] args){

    System.out.println("Enter the number");
    Scanner sc = new Scanner(System.in);
    
    int number = sc.nextInt();

    int originalNum = number;
    int digits;
    int sum=0;
    int n;

    while ( number != 0){

        number/=10;
        n++;

    }
    number=originalNum;

    while(number !=0){

        remainder= number % 10;
        sum += Math.pow(remainder,n);
        number/=10;
    }
    if (originalNum=sum) {
        System.out.println("the number is amstrong number" + sum);
        
    } else {
        System.out.println("The number is not amstrong number" + sum);        
    }




    }
    
    
}
