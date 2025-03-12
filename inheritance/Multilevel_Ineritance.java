class One{

    public void printOne(){

        System.out.println(" print one method of one class");
    }
}

class Two extends One{

    public void printTwo(){

        System.out.println("printtwo  method of tow class");
    }
}


public class Multilevel_Ineritance extends Two{


    public static void main(String[] args) {
         Multilevel_Ineritance md = new Multilevel_Ineritance();
         md.printOne();
         md.printTwo();
    }
    
}
