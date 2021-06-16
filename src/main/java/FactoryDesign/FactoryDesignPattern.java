package FactoryDesign;
/* Creation Design pattern which is used when we have multiple sub classes of a super class and based
* on that we want return one class instance. It provides abstraction between implementation and client classes.
* client classes do not have to instantiate the classes themselves.Used to hide the complexity of object creation. */

public class FactoryDesignPattern {

}

abstract class Vehicle {
    public abstract int getWheel();
}

class Car extends Vehicle {
    private int wheel;

    public Car(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        System.out.println("Making the car with number of wheels:" + wheel);
        return wheel;
    }
}

    class Bike extends Vehicle {
        public int wheel;

        public Bike(int wheel) {
            this.wheel = wheel;
        }

        public int getWheel() {
            System.out.println("Making the Bike with number of wheels:" + wheel);
            return this.wheel;
        }
    }


    class VehicleFactory {

       public static Vehicle getVehicle(int wheel) {
           if(wheel == 4){
               return new Car(4);
           }
           else if(wheel == 2){
               return new Bike(2);
           }
           else{
               return null;
           }
        }
    }



    class Main{
        public static void main(String[] args) {
            Vehicle vehicle = VehicleFactory.getVehicle(4);
            vehicle.getWheel();

            Vehicle vehicle2 = VehicleFactory.getVehicle(2);
            vehicle2.getWheel();
        }
    }






