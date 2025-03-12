class Computer {

    // overridden method
    public void display() {
        System.out.println("This is Computer");
    }
    public void print(){


        System.out.println("this is to dispaly computer ");
    }
}

class MobilePhone extends Computer {

    // overriding method
    @Override
    public void display() {
        System.out.println("This is new mobile phone");
    }

    public void printMessage() {

        // this calls overriding method
        display();

        // this calls overridden method
        super.display();
    }
}

class Laptop extends Computer{

    public void display(){


        System.out.println("this is a laptop");
    }

    public void printmessage(){
        
        super.print();
    }
}

public class SuperKeyword_Demo {
    public static void main(String[] args) {
        MobilePhone mp = new MobilePhone();
        mp.printMessage(); 
        Laptop lp = new Laptop();
        lp.printmessage();
    }
}