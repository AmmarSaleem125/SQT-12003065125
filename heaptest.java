/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package heap;

import junit.framework.TestCase;

/**
 *
 * @author MALIK
 */
public class HeapTest extends TestCase {
    
    public HeapTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of heapSort method, of class Heap.
     */
    public void testHeapSort() {
        System.out.println("*HeapTest: testHeapsort ");
        Comparable[] array = null;
        Heap instance = new Heap();
        instance.heapSort(array);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteMin method, of class Heap.
     */
    public void testDeleteMin() {
        System.out.println("*HeapTest: testdeleteMin");
        Heap instance = new Heap();
        Object expResult = null;
        Object result = instance.deleteMin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class Heap.
     */
    public void testInsert_GenericType() {
        System.out.println("*HeapTest: testinsert");
        Object x = null;
        Heap instance = new Heap();
        instance.insert(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Heap.
     */
    public void testToString() {
        System.out.println("*HeapTest: testtoString");
        Heap instance = new Heap();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Heap.
     */
    public void testMain() {
        System.out.println("*HeapTest: testmain");
        String[] args = null;
        Heap.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class Heap.
     */
    public void testInsert_Object() {
        System.out.println("*HeapTest: testinsert");
        Object x = null;
        Heap instance = new Heap();
        instance.insert(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
