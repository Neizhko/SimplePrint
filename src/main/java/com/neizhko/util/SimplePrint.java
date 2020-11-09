//: com/neizhko/util/SimplePrint.java
package com.neizhko.util;

/**
 * The simple Java library for prevent the code duplication of the standard text output method
 *
 * @author Vladimir Neizhko
 * @version 0.1 Beta
 */
class SimplePrint {
    /**
     * This method can print abstract object at console output without line break
     * @param object Is an abstract object that will be printed
     */
    static void print(Object object) {
        System.out.print(object);
    }
    /**
     * This method can print abstract object at console output with line break
     * @param object Is an abstract object that will be printed
     */
    static void println(Object object) {
        System.out.println(object);
    }
}///:~