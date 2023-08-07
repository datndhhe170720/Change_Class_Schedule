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
public class TeacherTest {
    
    public TeacherTest() {
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
     * Test of getId method, of class Teacher.
     */
    @Test
    public void testGetId() {
        System.out.println("testGetId");
        Teacher instance = new Teacher();
        String expResult = null;
        String result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Teacher.
     */
    @Test
    public void testSetId() {
        System.out.println("testSetId");
        String id = "Ma01";
        Teacher instance = new Teacher();
        instance.setId(id);
        String espected = "Ma01";
        assertEquals(espected, instance.getId());
        
    }

    /**
     * Test of getPass method, of class Teacher.
     */
    @Test
    public void testGetPass() {
        System.out.println("testGetPass");
        Teacher instance = new Teacher();
        String expResult = null;
        String result = instance.getPass();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPass method, of class Teacher.
     */
    @Test
    public void testSetPass() {
        System.out.println("testSetPass");
        String pass = "pass123";
        Teacher instance = new Teacher();
        instance.setPass(pass);
        String espected = "pass123";
        assertEquals(espected, instance.getPass());
       
    }

    /**
     * Test of getName method, of class Teacher.
     */
    @Test
    public void testGetName() {
        System.out.println("testGetName");
        Teacher instance = new Teacher();
        String expResult = null;
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Teacher.
     */
    @Test
    public void testSetName() {
        System.out.println("testSetName");
        String name = "Minhtd";
        Teacher instance = new Teacher();
        instance.setName(name);
        String espected = "Minhtd";
        assertEquals(espected, instance.getName());
    }

    /**
     * Test of getEmail method, of class Teacher.
     */
    @Test
    public void testGetEmail() {
        System.out.println("testGetEmail");
        Teacher instance = new Teacher();
        String expResult = null;
        String result = instance.getEmail();
        assertEquals(expResult, result);

    }

    /**
     * Test of setEmail method, of class Teacher.
     */
    @Test
    public void testSetEmail() {
        System.out.println("testSetEmail");
        String email = "minh123@gmail.com";
        Teacher instance = new Teacher();
        instance.setEmail(email);
         String espected = "minh123@gmail.com";
         assertEquals(espected, instance.getEmail());
    }

    /**
     * Test of getGender method, of class Teacher.
     */
    @Test
    public void testGetGender() {
        System.out.println("testGetGender");
        Teacher instance = new Teacher();
        String expResult = null;
        String result = instance.getGender();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGender method, of class Teacher.
     */
    @Test
    public void testSetGender() {
        System.out.println("testSetGender");
        String gender = "Male";
        Teacher instance = new Teacher();
        instance.setGender(gender);
        String espected = "Male";
        assertEquals(espected, instance.getGender());
    }

    /**
     * Test of getAddress method, of class Teacher.
     */
    @Test
    public void testGetAddress() {
        System.out.println("testGetAddress");
        Teacher instance = new Teacher();
        String expResult = null;
        String result = instance.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAddress method, of class Teacher.
     */
    @Test
    public void testSetAddress() {
        System.out.println("testSetAddress");
        String address = "Hanoi";
        Teacher instance = new Teacher();
        instance.setAddress(address);
        String espected = "Hanoi";
        assertEquals(espected, instance.getAddress());
    }

    /**
     * Test of checkTeacher method, of class Teacher.
     */
    @Test
    public void testCheckTeacher() {
        System.out.println("testCheckTeacher");
        Teacher instance = new Teacher();
        boolean expResult = false;
        boolean result = instance.checkTeacher();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListTeacher method, of class Teacher.
     */
    @Test
    public void testGetListTeacher() {
        System.out.println("testGetListTeacher");
        Teacher instance = new Teacher();
        ArrayList<Teacher> expResult = null;
        ArrayList<Teacher> result = instance.getListTeacher();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of getTeacher method, of class Teacher.
     */
    @Test
    public void testGetTeacher() {
        System.out.println("getTeacher");
        String idd = "";
        Teacher instance = new Teacher();
        instance.getTeacher(idd);
    }
    
}
