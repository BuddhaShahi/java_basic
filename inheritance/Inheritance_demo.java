 class Employee {

    float salary= 40000;


    
}

class programmer extends Employee{

    int bonus = 10000;

}
public class Inheritance_demo{

    public static void main(String[] args) {
        

        programmer p = new programmer();
        System.out.println("Programming salary is " + p.salary);

        System.out.println(" Bonus of programmmer is "+ p.bonus);  
}
