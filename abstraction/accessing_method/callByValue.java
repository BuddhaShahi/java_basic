public class callByValue {


    public static void increment(int number){


        number = number+1;
        System.out.println("Value in method"+number);
    }

    public static void main(String[] args) {
        int number=10;
        System.out.println("value before method call:" + number);
        increment(number);
        System.out.println("value after method call: " +number);

    }
    
}
