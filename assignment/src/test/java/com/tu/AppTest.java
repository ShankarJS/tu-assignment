package com.tu;

import java.util.HashSet;
import java.util.Set;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testFindMax() {
    	assertEquals(4, FindMaxInteger.findMax(new int[]{1, 3, 4, 2}));
    	assertEquals(-1, FindMaxInteger.findMax(new int[]{-12, -1, -3, -4, -2}));
    }
    
    public void testHashSetDemo() {
    	Set<Employee> emp = new HashSet();
		emp.add(new Employee(001, "John", "Doe"));
		emp.add(new Employee(002, "Sachin", "Tendulkar"));
		emp.add(new Employee(001, "John", "Doe"));
		
		
    }
}
