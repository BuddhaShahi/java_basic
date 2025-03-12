class First{


    public void printOne(){

        System.out.println("Printone() method of class one");

    }

    }

class Second extends First{

    public void printTwo(){

        System.out.println(" Two() method of class two ");
    }
}

class Third extends First{

    public void printThree(){

        System.out.println(" Three() method of class three");
    }
}


public class Hierarchial_Ineritance {

    public static void main(String[] args) {
        

        Second s = new Second();
        Third t = new Third();

        s.printOne();
        t.printOne();
    }

    
}