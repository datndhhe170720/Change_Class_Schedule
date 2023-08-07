/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class ClassTest {
    
    public ClassTest() {
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
     * Test of getClassid method, of class Class.
     */
    @Test
    public void testGetClassid() {
        System.out.println("getClassid");
        Class instance = new Class();
        String expResult = "";
        String result = instance.getClassid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClassid method, of class Class.
     */
    @Test
    public void testSetClassid() {
        System.out.println("setClassid");
        String classid = "";
        Class instance = new Class();
        instance.setClassid(classid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudent method, of class Class.
     */
    @Test
    public void testGetStudent() {
        System.out.println("getStudent");
        Class instance = new Class();
        String expResult = "";
        String result = instance.getStudent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudent method, of class Class.
     */
    @Test
    public void testSetStudent() {
        System.out.println("setStudent");
        String student = "";
        Class instance = new Class();
        instance.setStudent(student);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListClass method, of class Class.
     */
    @Test
    public void testGetListClass() {
        System.out.println("getListClass");
        Class instance = new Class();
        ArrayList<Class> expResult = null;
        ArrayList<Class> result = instance.getListClass();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClass method, of class Class.
     */
    @Test
    public void testGetClass() {
        System.out.println("getClass");
        String id = "";
        Class instance = new Class();
        instance.getClass(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateClass method, of class Class.
     */
    @Test
    public void testUpdateClass() {
        System.out.println("updateClass");
        Class instance = new Class();
        instance.updateClass();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteClass method, of class Class.
     */
    @Test
    public void testDeleteClass() {
        System.out.println("deleteClass");
        String id = "";
        Class instance = new Class();
        instance.deleteClass(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addClass method, of class Class.
     */
    @Test
    public void testAddClass() {
        System.out.println("addClass");
        Class instance = new Class();
        instance.addClass();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
