/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tqsrecurso;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author gonca
 */
public class TaskTest {
    
    public TaskTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Task.
     */
    @org.junit.Test
    public void testGetId() {
        System.out.println("getId");
        Task instance = new Task();
        instance.setId(2);
        Integer expResult = 2;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Task.
     */
    @org.junit.Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = 2;
        Task instance = new Task();
        instance.setId(id);
        assertEquals(id,instance.getId());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthor method, of class Task.
     */
    @Ignore
    @org.junit.Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getAuthor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthor method, of class Task.
     */
    @Ignore
    @org.junit.Test
    public void testSetAuthor() {
        System.out.println("setAuthor");
        String author = "";
        Task instance = new Task();
        instance.setAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class Task.
     */
    @Ignore
    @org.junit.Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class Task.
     */
    @Ignore
    @org.junit.Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Task instance = new Task();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Task.
     */
    @Ignore
    @org.junit.Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Task.
     */
    @Ignore
    @org.junit.Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Task instance = new Task();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPriority method, of class Task.
     */
    @Ignore
    @org.junit.Test
    public void testGetPriority() {
        System.out.println("getPriority");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getPriority();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPriority method, of class Task.
     */
    @Ignore
    @org.junit.Test
    public void testSetPriority() {
        System.out.println("setPriority");
        String priority = "";
        Task instance = new Task();
        instance.setPriority(priority);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatelimit method, of class Task.
     */
    @Ignore
    @org.junit.Test
    public void testGetDatelimit() {
        System.out.println("getDatelimit");
        Task instance = new Task();
        Date expResult = null;
        Date result = instance.getDatelimit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDatelimit method, of class Task.
     */
    @Ignore
    @org.junit.Test
    public void testSetDatelimit() {
        System.out.println("setDatelimit");
        Date datelimit = null;
        Task instance = new Task();
        instance.setDatelimit(datelimit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Task.
     */
    @Ignore
    @org.junit.Test
    public void testHashCode() {
        System.out.println("hashCode");
        Task instance = new Task();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Task.
     */
    @Ignore
    @org.junit.Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Task instance = new Task();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Task.
     */
    @Ignore
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Task instance = new Task();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
