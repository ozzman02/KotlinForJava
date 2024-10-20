package javacode;


import kotlincode.Car;
import kotlincode.SingletonObj;
import kotlincode.StaticCar;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        StaticCar.topLevel();
        StaticCar.print("Print this Java string");
        Car car = new Car("blue", "BMW", 2011, true);
        System.out.println(car.getColor());
        System.out.println(car.model);
        System.out.println(car.isAutomatic());

        Car.Companion.carComp();
        Car.carComp();
        System.out.println("isAuto = " + Car.isAuto);
        System.out.println("constant = " + Car.constant);

        SingletonObj.INSTANCE.doSomething();
        SingletonObj.doSomething();

        car.printMe("null");
        try {
            StaticCar.doIO();
        } catch (IOException e) {
            System.out.println("IOException !");
        }

        StaticCar.defaultArgs("The number is:");

    }

}