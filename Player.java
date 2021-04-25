// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Player extends Actor
{
    private boolean canFire = true;

    /**
     * 
     */
    public Player()
    {
        setRotation(270);
    }

    /**
     * Act - do whatever the Player wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        fireBullet();
    }

    /**
     * 
     */
    public void moveAround()
    {
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 5, getY());
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 5, getY());
        }
    }

    /**
     * 
     */
    public void fireBullet()
    {
        if (Greenfoot.isKeyDown("space") && canFire == true) {
            getWorld().addObject( new  Bullet(), getX(), getY() - 55);
            canFire = false;
        }
        else if ( ! Greenfoot.isKeyDown("space")) {
            canFire = true;
        }
    }
}
