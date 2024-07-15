package org.swiggy_assignment;

import junit.framework.TestCase;
import junit.framework.Test;
import junit.framework.TestSuite;

public class PlayerTest extends TestCase
{
   
    public PlayerTest(String testName)
    {
        super(testName);
    }

   
    public static Test suite()
    {
        return new TestSuite(PlayerTest.class);
    }

   
    public void testAttack()
    {
        Player player = new Player(50, 5, 10);
        int attackRoll = player.attack();
        assertTrue("Attack roll should be between 1 and 6", attackRoll >= 1 && attackRoll <= 6);  
    }

    public void testDefend()
    {
        Player player = new Player(100, 5, 10);
        int defenseRoll = player.defend();
        assertTrue("Defense roll should be between 1 and 6", defenseRoll >= 1 && defenseRoll <= 6);
    }
}
