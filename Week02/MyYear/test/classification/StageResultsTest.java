/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classification;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author otaylor4
 */
public class StageResultsTest {
    private StageResults empty;
    private StageResults full;
    private StageResults halfFull;
    
    public StageResultsTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        empty = new StageResults();
        
        full = new StageResults();
        full.addModuleMark(120,50.0);
        
        halfFull = new StageResults();
        halfFull.addModuleMark(60, 50.0);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetStage2Average() {
    }

    @Test
    public void testGetTotalCredits() {
    }

    @Test
    public void testGetTotalMarks() {
    }

    @Test
    public void testSetStage2Average() {
    }

    @Test
    public void testIsComplete() {
        System.out.println("Testing is Complete");
        
        assertFalse("empty object", empty.isComplete());
        assertFalse("halfFull object", halfFull.isComplete());
        assertTrue("full object", full.isComplete());
    }

    @Test
    public void testResetValues() {
        System.out.println("Testing resetValues");
        
        full.resetValues();
        
        int expIntResult = 0;
        double expDoubleResult = 0.0;
        
        assertEquals("credits", expIntResult, full.getTotalCredits());
        assertEquals("total", expDoubleResult, full.getTotalMarks(), 0.0);
        
        full.addModuleMark(120,50.0);
    }

    @Test
    public void testAddModuleMark() {
        System.out.println("Testing addModuleMarks");
        
        empty.addModuleMark(10, 50.0);
        
        int expIntResult = 10;
        double expDoubleResult = 50.0;
        
        assertEquals("credits", expIntResult, empty.getTotalCredits());
        assertEquals("total", expDoubleResult, empty.getTotalMarks(), 0.0);
        empty.resetValues();
 
    }

    @Test
    public void testCalculateAverageSoFar() {
        fail("Test not yet implemented");
    }

    @Test
    public void testPredictClass() {
        fail("Test not yet implemented");
    }
    
}
