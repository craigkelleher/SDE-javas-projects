package com.entertainment;

import static org.junit.Assert.*;

import org.junit.Test;

public class TelevisionTest {

  //private final Television tv = new Television("Samsung", 0, DisplayType.OLED);

  @Test
  public void testSetVolume() {
    Television tv = new Television();

    tv.setVolume(0);
    assertEquals(0, tv.getVolume());

    tv.setVolume(100);
    assertEquals(100, tv.getVolume());
  }

  @Test
  public void testSetVolumeIllegalArgumentException() {
    Television tv = new Television();

    // if, exception is thrown, jump to catch
    try {
      tv.setVolume(-1);
      // if you get to next line, previous one did not throw an exception
      fail("Should have thrown IllegalArgumentException");
      // so you fail it because it be wrong.
    }
    catch (IllegalArgumentException e) {
      assertEquals("Invalid volume: -1. Allowed range: [0,100].", e.getMessage());
    }

    // if, exception is thrown, jump to catch
    try {
      tv.setVolume(110);
      fail("Should have thrown IllegalArgumentException");
    }
    catch (IllegalArgumentException e) {
      assertEquals("Invalid volume: 110. Allowed range: [0,100].", e.getMessage());
    }
  }

  // unhandled checked exception, throws clause needed,
  @Test
  public void testChangeChannel() throws InvalidChannelException {
    Television tv = new Television();

    tv.changeChannel(1);
    assertEquals(1, tv.getCurrentChannel());

    tv.changeChannel(999);
    assertEquals(999, tv.getCurrentChannel());
  }

  //unhandled checked exception
  @Test(expected=InvalidChannelException.class)
  public void testChangeChannelInvalidChannelException() throws InvalidChannelException {
    Television tv = new Television();
    tv.changeChannel(0);
    //but this path doesn't show if volume was changed before throwing exception
    // so try catch tries to avoid that, and throw a fail if didn't avoid.
    // want to make sure change channel wasn't changed before throwing exception
  }

  @Test()
  public void testCompareTo() {
    // compare to compares to order.
    Television tv1 = new Television("RCA");
    Television tv2 = new Television("Sony");
    Television tv3 = new Television("Zenith");

    assertTrue(tv1.compareTo(tv2) < 1);
    assertTrue(tv3.compareTo(tv2) > 1);

    tv2.setBrand("RCA");
    assertTrue(tv1.compareTo(tv2) == 0);
  }

  @Test
  public void testHashCode() {  // brand, volume, display
    Television tv1 = new Television("RCA", 10, DisplayType.LED);
    Television tv2 = new Television("RCA", 10, DisplayType.LED);

    assertEquals(tv1.hashCode(), tv2.hashCode());
  }

  @Test
  public void testEquals() {  // brand, volume, display
    Television tv1 = new Television("RCA", 10, DisplayType.LED);
    Television tv2 = new Television("RCA", 10, DisplayType.LED);
    assertEquals(tv1, tv2);
    assertNotEquals(tv1, tv2);
  }

}