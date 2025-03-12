//program to prime and composite number

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        sc.close();
        if( number == 1){
            System.out.println("Number must be greater than 1");
        }
        
        for(int i = 2; i< number; i++){

            if (number % i== 0) {

                System.out.println("The number is composite =" + number);
                
            }                
            else{
            System.out.println(" the number is prime " + number);
        }
        }
            
        }                  



        }
        



    

