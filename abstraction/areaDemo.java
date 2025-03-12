public class areaDemo {


    public static void main(String[] args) {
        shapDemo rectangle = new rectangleDemo(8,9);
        shapDemo cir = new circleDemo(7);

        rectangle.dispaly();

        System.out.println("this is am area of rectamgle:" + rectangle.area());

        cir.dispaly();

        System.out.println("This is area of circle " + cir.area());



    }
    
}
