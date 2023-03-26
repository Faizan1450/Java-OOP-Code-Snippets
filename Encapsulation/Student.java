package Encapsulation;

//Entity class
public class Student {
    
    //Data members are private
    private int roll;
    private String name;
    private double per;

    //Parametrized Constructor
    public Student(int roll, String name, double per) {
        this.roll = roll;
        this.name = name;
        this.per = per;
    }

    //Setter
    public void setStudent(int roll, String name, double per) {
        this.roll = roll;
        this.name = name;
        this.per = per;
    }

    public void showStudent() {
        System.out.println("Roll:" + roll + ", Name:" + name + ", Per" + per);
    }
}
