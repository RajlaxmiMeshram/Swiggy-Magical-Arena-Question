package org.swiggy_assignment;

import junit.framework.TestCase;
import junit.framework.Test;
import junit.framework.TestSuite;

public class MagicalArenaTest extends TestCase
{
    public MagicalArenaTest(String testName)
    {
        super(testName);
    }
    public static Test suite()
    {
        return new TestSuite(MagicalArenaTest.class);
    }
    public void testFight()
    {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        MagicalArena arena = new MagicalArena(playerA, playerB);
        arena.fight();
        assertFalse(playerA.isAlive() && playerB.isAlive()); // Either playerA or playerB should be dead after the fight
    }
}
