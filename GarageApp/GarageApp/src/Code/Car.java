/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author SA22527974
 */
public class Car {
    private String vehicleNumber;    
    private String driverName; 

    public Car(String vehicleNumber, String driverName) {
        this.vehicleNumber = vehicleNumber;
        this.driverName = driverName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getDriverName() {
        return driverName;
    }
    
    
}
