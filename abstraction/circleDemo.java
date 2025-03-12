public class circleDemo extends shapDemo {
    private double radius;

    public circleDemo(double radius){


        this.radius = radius;

    }
    public double area(){


        return Math.PI * radius * radius;
    }

    
    
}
