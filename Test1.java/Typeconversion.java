public class Typeconversion {
    public static void main(String[] args) {

        int age = 2;
        String AGE_AS_STRING = Integer.toString(age);

        System.out.println("The child is " + AGE_AS_STRING + " years old");
        // The child is 2 years old
    }
}
class IntToStr {
    public static void main(String[] args) {

        int age = 2;

        String AGE_AS_STRING = Integer.toString(age);


        System.out.println(((Object)age).getClass().getSimpleName());
        // Integer

        System.out.println(AGE_AS_STRING.getClass().getSimpleName());
        // String
    }
}
