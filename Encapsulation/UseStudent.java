package Encapsulation;

//Driver Class
public class UseStudent {
    public static void main(String[] args) {
        Student first = new Student(112, "Faizan", 80.01);
        first.showStudent();
        Student second = new Student(113, "Abhishek", 75.36);
        second.showStudent();
    }
}