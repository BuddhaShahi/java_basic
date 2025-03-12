import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        
        System.out.println("Enter the one alphabet");
        Scanner sc = new Scanner(System.in);
        char alphabet= sc.next().charAt(0);
        if (alphabet=='A' || alphabet=='E' || alphabet=='I' || alphabet=='O'|| alphabet=='U'|| alphabet=='a'|| alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u') {
            
            System.out.println(alphabet + "\thas a vowel letter");
        } else {

            System.out.println(alphabet + "\t has no vowel letter");
            
        }
        sc.close();
    }
}
