/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.week.one;

/**
 *
 * @author 0garlj92
 */
public class ProjectWeekOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car c1 = new Car();
        Car c2 = new Car();
        
        c1.setmaxspeed(190);
        c1.setCurrentSpeed(50);
        c1.setFuelLevel(40);
        System.out.println("Car 1 Current speed: " + c1.getCurrentSpeed());
        System.out.println("Car 1 Max speed: " + c1.getMaxSpeed());
        System.out.println("Car 1 Fuel Level: " + c1.getFuelLevel());
        System.out.println("Car 2 Current speed: " + c2.getCurrentSpeed());
        System.out.println("Car 2 Max speed: " + c2.getMaxSpeed());
        System.out.println("Car 2 Fuel Level: " + c2.getFuelLevel());
        c1.accelerate();
        c1.refuel();
        c2.brake();
        System.out.println("Car 1 Current speed: " + c1.getCurrentSpeed());
        System.out.println("Car 1 Max speed: " + c1.getMaxSpeed());
        System.out.println("Car 1 Fuel Level: " + c1.getFuelLevel());
        System.out.println("Car 2 Current speed: " + c2.getCurrentSpeed());
        System.out.println("Car 2 Max speed: " + c2.getMaxSpeed());
        System.out.println("Car 2 Fuel Level: " + c2.getFuelLevel());
         
    }
    
}
