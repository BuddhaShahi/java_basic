public class MethodOverloding {

    public int add(int a,int b){


        return a + b;
    }
    
    public int add(int a, int b, int c) {

        return a + b+c;
    }
    
    public double add(double a, double b){

        return a + b;
    }
    
    public String add( String a, String b){

        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloding mod = new MethodOverloding();

        System.out.println("sum of a and b is : "+ mod.add(5,10));
        System.out.println("Sum of a and b is "+ mod.add(5,10,8));
        System.out.println("Sum of a and b is " + mod.add(3.5,2.7));
        System.out.println("Concatenation of 'hello' and 'world' is:  "+ mod.add("hello", "World"));
    }
}
