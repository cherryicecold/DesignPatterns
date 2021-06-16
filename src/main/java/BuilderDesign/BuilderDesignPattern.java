/* Creation design pattern. It is used when there are too many arguments to send in constructor and it's hard to
maintain the order. When we don't want to send all parameters in Object initialization.Generally, we send optional
parameters as null
We create a 'static nested class', which contains all arguments of outer class.
Builder class have a public constructor with all required parameters.
Builder class should have setter methods for optional parameters.
A 'build()' method will return the final Object.
*/
package BuilderDesign;

import org.xml.sax.SAXNotRecognizedException;



class Vehicle {
    //required parameters;
    private String engine;
    private int wheel;

    //optional parameters
    private int airbags;

    public String getEngine() {
        return engine;
    }

    public int getWheel() {
        return wheel;
    }

    public int getAirbags() {
        return airbags;
    }

    private Vehicle(VehicleBuilder vehicleBuilder) {
        this.engine = vehicleBuilder.engine;
        this.wheel = vehicleBuilder.wheel;
        this.airbags = vehicleBuilder.airbags;
    }

    public static class VehicleBuilder {
        private String engine;
        private int wheel;

        private int airbags;

        public VehicleBuilder(String engine, int wheel) {
            this.engine = engine;
            this.wheel = wheel;
        }
        public VehicleBuilder setAirbags(int airbags) {
            this.airbags = airbags;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }
    }
}

public class BuilderDesignPattern {
    public static void main(String[] args) {
        Vehicle car = new Vehicle.VehicleBuilder("1500cc", 4).setAirbags(4).build();
        Vehicle bike = new Vehicle.VehicleBuilder("250cc",2).build();

        System.out.println(car.getEngine());
        System.out.println(car.getWheel());
        System.out.println(car.getAirbags());
        System.out.println(bike.getEngine());
        System.out.println(bike.getWheel());
        System.out.println(bike.getAirbags());
    }
}


