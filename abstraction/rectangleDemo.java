public class rectangleDemo extends shapDemo {

    private double length;
    private double width;

    public rectangleDemo(double len , double wid){


        this.length=len;
        this.width=wid;
    }

    public double area(){

    return length * width;
    }
    
}
