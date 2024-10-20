package javacode;

import kotlincode.Challenge;
import kotlincode.Employee;
import kotlincode.KotlinStuff;

public class Main {

    public static void main(String[] args) {

        KotlinStuff.sayHelloToJava("Student");
        Employee employee = new Employee("John", "Smith", 2010);
        employee.startYear = 2009;

        Challenge.doMath(5, 4);
        employee.takesDefault("arg1");
    }

}