class Student {
    private String name;
    private int rollNumber;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}

public class StudentClassDemo {
    public static void main(String[] args) {
        Student student = new Student();
        
        student.setName("John Doe");
        student.setRollNumber(101);
        
        System.out.println("Student Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
    }
}