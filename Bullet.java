// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Bullet extends Actor
{

    /**
     * 
     */
    public Bullet()
    {
        getImage().scale(getImage().getWidth() / 2, getImage().getHeight() / 2);
    }

    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        bulletMove();
        removeFromWorld();
    }

    /**
     * 
     */
    public void bulletMove()
    {
        setLocation(getX(), getY() - 5);
    }

    /**
     * 
     */
    public void removeFromWorld()
    {
        if (getY() == 0) {
            getWorld().removeObject(this);
        }
    }
}
