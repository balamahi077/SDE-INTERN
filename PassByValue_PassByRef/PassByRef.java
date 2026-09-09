package PassByValue_PassByRef;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}
public class PassByRef {
    
    public static void main(String[] args) {
        
        Student student = new Student("Bala");
        change(student);
        System.out.println(student.name);
        
    }
    static void change(Student student) {
        // student = new Student("Krishna");  // this is example of not a reference 

        student.name = "Krishna";  // this is a example of Pass by reference
    }
}
