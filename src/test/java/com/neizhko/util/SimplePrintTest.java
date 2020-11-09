//: com/neizhko/util/SimplePrintTest.java
package com.neizhko.util;
import org.junit.*;
import static com.neizhko.util.SimplePrint.*;

/**
 * Unit tests for SimplePrint library
 * @author Vladimir Neizhko
 */
public class SimplePrintTest {

    private String string = "Test message";
    /*
     *TODO: add a comparison of the output to the original object and return an exception
     */

    @BeforeClass
    public static void initializeTestMessage() {
        System.out.println("Unit tests for SimplePrint library");
        System.out.println("Java version: " + System.getProperty("java.version"));
    }

    @Test
    public void testPrint() {
        System.out.println("\nTest of method Print");
        System.out.println("Result:");
        print(string);
    }

    @Test
    public void testPrintln() {
        System.out.println("\nTest of method Println");
        System.out.println("Result:");
        println(string);
    }

    @After
    public void afterTest() {
        System.out.println("\nTest finished");
    }
}///:~