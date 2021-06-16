package PrototypeDesign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* creation design pattern.
Used when you want to avoid multiple Object creation of same instance; instead you copy the Object to
new object and then we can modify as per our need.
Object which we're copying should provide copying feature by implementing Cloneable interface.
We can override clone() method to implement as per our need.
* */


class Vehicle implements Cloneable{
    private List<String> vehicleList;

    public Vehicle(){

    }

    public Vehicle(List<String> list){
        this.vehicleList = list;
    }

    public void insertData(){
        vehicleList = Arrays.asList("Honda Amaze",
                                    "Audi A4",
                                    "Hyundai Creta",
                                    "Maruti Baleno",
                                    "Renault Duster");
    }
    public List<String> getVehicleList(){
        return this.vehicleList;
    }
    public Object clone() throws CloneNotSupportedException {
        List<String> copy = new ArrayList<>();
        for(String carName : vehicleList){
            copy.add(carName);
        }
        return new Vehicle(copy);
    }
}

public class PrototypeDesignPattern {
    public static void main(String[] args) throws CloneNotSupportedException {
        Vehicle vehicle = new Vehicle();
        vehicle.insertData();
        Vehicle vehicleProto = (Vehicle)vehicle.clone();
        vehicleProto.getVehicleList().add("Tesla");
        System.out.println(vehicle.getVehicleList());
        System.out.println(vehicleProto.getVehicleList());
    }
}