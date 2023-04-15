package creational.singleton;

import Encapsulation.Student;

public class UseMySingletonObject {

    public static void main(String[] args) {

        MySingletonObject singletonObject = MySingletonObject.getInstance("myValue");

    }
}
