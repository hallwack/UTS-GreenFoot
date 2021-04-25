// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Enemy2 extends Enemy
{
    private int timesHit = 2;

    /**
     * 
     */
    public Enemy2()
    {
        getImage().scale(getImage().getWidth() / 2, getImage().getHeight() / 2);
        setRotation(90);
        
    }

    /**
     * Act - do whatever the Enemy2 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveEnemy();
        hitByBullet();
    }

    /**
     * 
     */
    public void hitByBullet()
    {
        if (getOneIntersectingObject(Bullet.class) != null) {
            getWorld().removeObject(getOneIntersectingObject(Bullet.class));
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            Counter counter = myWorld.getCounter();
            counter.addScore();
            timesHit = timesHit - 1;
        }
        if (timesHit == 0) {
            getWorld().removeObject(this);
        }
        else if (getY() == 599) {
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            HealthBar healthBar = myWorld.getHealthBar();
            healthBar.loseHealth();
            healthBar.loseHealth();
            getWorld().removeObject(this);
        }
    }
}
