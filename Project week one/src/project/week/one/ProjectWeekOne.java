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
        Car c1 = new Car("c1");
        Car c2 = new Car("c2");
        
        c1.setmaxspeed(190);
        c1.setCurrentSpeed(50);
        c1.setFuelLevel(40);
        c1.printStatus();
        c2.printStatus();
        c1.accelerate();
        c1.refuel();
        c2.brake();
        c1.printStatus();
        c2.printStatus();
    }
    
}
