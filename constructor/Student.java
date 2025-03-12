public class Student {

    int id;
    string name;

    Student(){

        id = 100;
        name="john";

    }

    Student(int i, String n){

        id = i;
        name=n;

    }

    
}

    public static void main(String[] args) {
        Student s1= new Student();
        Student s2 = new Student(101,"Ram");


        System.out.println(s1.id + "" + s1.name);
        System.out.println(s2.id+ "" + s2.name);
    }
