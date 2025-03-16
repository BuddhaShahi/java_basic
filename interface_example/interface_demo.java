package interface_example;

public class interface_demo {



    public static void main(String[] args) {


        Flyable[] flyingobjects = { new Spacecraft(), new Airplane(), new Helicopter()};

        for( Flyable obj: flyingobjects){

            obj.fly_obj();
        }

        
    }
    
}