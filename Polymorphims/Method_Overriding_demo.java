class Animal1 {
    // Base class
    void move() {
        System.out.println("Animal is moving.");
    }

    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog1 extends Animal1 {
    @Override
    void move() {
        System.out.println("Dog is running.");
    }

    void bark() {
        System.out.println("Dog is barking.");
    }
}

class Bufallo1 extends Animal1{
    
    void move(){
        System.out.println("buffallo is eating grass");

    }

    void talk(){


        System.out.println("buffallo is having a good time eatinga grass");
    }








}

public class Method_Overriding_demo {
    public static void main(String[] args) {
		Dog1 d1 = new Dog1();
        Bufallo1 b1 = new Bufallo1();
		d1.move(); 
		d1.eat(); 
		d1.bark();
        b1.move();
        b1.eat();
        b1.talk();
	}
}