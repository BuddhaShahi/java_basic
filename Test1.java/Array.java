import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        
        
        System.out.println("Enter the no of elememtsin array");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0;i<num;i++){
            
            System.out.printf("Enter the number in array[%d]",i+1);
            a[i]=sc.nextInt();
        }
        System.out.println("\n diplay array elements");
        for(int e : a){
            System.out.println(e);
        }
    }
    
}
