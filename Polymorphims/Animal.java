package polymorphism;


class AnimalSounds {

    public void Sound(){
        
        System.out.println("the animal make different sounds when asked to speak. for example:");
    }

    }
class Cow extends AnimalSounds{

    public void Sound(){

        System.out.println("the cow says: moh moh");

    }

}


class Cat extends AnimalSounds{


    public void Sound(){

        System.out.println("THe cat says: mew mew");




    }


}

class Dog extends AnimalSounds{

    public void Sound(){


        System.out.println("THe dogs says: ");
    }





}

public class Animal {

    public static void main(String[] args){

        AnimalSounds Animal = new AnimalSounds();

        AnimalSounds Cow = new Cow();

        AnimalSounds Cat =  new Cat();

        AnimalSounds Dog = new Dog();


        Animal.Sound();

        Cat.Sound();

        Cow.Sound();

        Dog.Sound();



    }

}





    

