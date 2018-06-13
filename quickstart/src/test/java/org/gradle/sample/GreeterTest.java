package org.gradle.sample;

import org.junit.Test;
import static org.junit.Assert.*;

public class GreeterTest {
    @Test
    public void testGetGreeting() {
        assertEquals("hello Gradle", "hello Gradle");
    }
    @Test
    public void testAssertEquals() {
      assertEquals("failure - strings are not equal", "text", "text");
    }
  
    @Test
    public void testAssertFalse() {
      assertFalse("failure - should be false", false);
    }
  
    @Test
    public void testAssertNotNull() {
      assertNotNull("should not be null", new Object());
    }
  
    @Test
    public void testAssertNotSame() {
      assertNotSame("should not be same Object", new Object(), new Object());
    }
  
    @Test
    public void testAssertNull() {
      assertNull("should be null", null);
    }
  
    @Test
    public void testAssertSame() {
      assertSame("should be same", 3, 3);
    }

    @Test
    public void testAssertTrue() {
      assertTrue("failure - should be true", true);
    }
}
