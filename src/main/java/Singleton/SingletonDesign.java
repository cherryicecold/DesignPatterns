/*
Singleton Design pattern, Object creation design pattern.
Only one instance of the class should exist.
Other classes should be able to get instance of the Singleton class
Used in Logging, Cache, Session, Drivers
Ways to implement :
    Construction should be private as we don't want multiple objects to be created from outside. So that we
    can only create instance from the class. private Static variable and a public static method
    1. Eager initialization.
    2. Lazy Initialization.
    3.Thread Safe Method Initialisation.
    4. Thread Safe block initialisation.
 */
package Singleton;

public class SingletonDesign {
    private static SingletonDesign singletonDesign = null;
    private SingletonDesign (){

    }

    public static SingletonDesign getSingleonDesign(){
        if (singletonDesign == null)
             singletonDesign = new SingletonDesign();
            return singletonDesign;
    }

    public static void main(String[] args) {
        SingletonDesign sd1 = getSingleonDesign();
        SingletonDesign sd2 = getSingleonDesign();

        System.out.println(sd1==sd2);
        System.out.println("equals");
        System.out.println(sd1.equals(sd2));
    }
}
