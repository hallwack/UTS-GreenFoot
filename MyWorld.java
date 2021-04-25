// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{
    private HealthBar healthBar =  new  HealthBar();
    private Counter counter =  new  Counter();

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 600, 1);
        start();
    }

    /**
     * 
     */
    public Counter getCounter()
    {
        return counter;
    }

    /**
     * 
     */
    public HealthBar getHealthBar()
    {
        return healthBar;
    }

    /**
     * 
     */
    public void act()
    {
        addEnemy1();
        addEnemy2();
    }

    /**
     * 
     */
    public void addEnemy1()
    {
        if (Greenfoot.getRandomNumber(20) < 1) {
            addObject( new  Enemy1(), Greenfoot.getRandomNumber(600), 0);
        }
    }

    /**
     * 
     */
    public void addEnemy2()
    {
        if (Greenfoot.getRandomNumber(50) < 1) {
            addObject( new  Enemy2(), Greenfoot.getRandomNumber(600), 0);
        }
    }

    /**
     * 
     */
    public void start()
    {
        addObject( new  Player(), 300, 530);
         new  Player().setLocation(300, 530);
        addObject(counter, 120, 50);
        addObject(healthBar, 500, 50);
    }
}
