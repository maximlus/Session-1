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
public class Car {
    private int currentSpeed;
    private int maxSpeed;
    private int fuelLevel;
    
    public Car()
    {
        currentSpeed = 30;
        maxSpeed = 210;
        fuelLevel = 60;
    }
    public void setCurrentSpeed(int currentSpeedIn)
    {
        currentSpeed = currentSpeedIn;
    }
    public void setmaxspeed(int maxSpeedIn)
    {
        maxSpeed = maxSpeedIn;
    }
    public void setFuelLevel(int fuelLevelIn)
    {
        fuelLevel = fuelLevelIn;
    }
    public void accelerate()
    {
        currentSpeed++;
        fuelLevel--;
    }
    public void brake()
    {
        currentSpeed--;
    }
    public void refuel()
    {
        fuelLevel = 100;
    }
    public int getCurrentSpeed()
    {
            return currentSpeed;
    }
    public int getMaxSpeed()
    {
        return maxSpeed;
    }
    public int getFuelLevel()
    {
        return fuelLevel;
    }
    
}
