// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Enemy extends Actor
{

    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }

    /**
     * 
     */
    public void moveEnemy()
    {
        setLocation(getX(), getY() + 1);
        
    }

    /**
     * 
     */
    public void removeEnemy()
    {
        if (getY() == 599) {
            getWorld().removeObject(this);
        }
    }
}
