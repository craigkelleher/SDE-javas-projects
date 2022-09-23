/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.entertainment.catalog;

import static org.junit.Assert.*;
import java.util.Collection;
import java.util.Map;
import org.junit.Test;
import com.entertainment.Television;

public class CatalogTest {
  
  /**
   * Contract: a no-matches result should be an empty collection (not null).
   */
  @Test
  public void testFindByBrandNoMatches() {
    Collection<Television> tvs = Catalog.findByBrand("NO-MATCHES");
    //asserting we did get a collection back
    assertNotNull(tvs); // failed because it was null in Catalog.java "returns null"
    //null means points to nothing. we are pointing to an object that is pointing to nothing
    // empty and null do not make the same thing
    assertTrue(tvs.isEmpty());
  }

  @Test
  public void testFindByBrandWithMatches(){
    Collection<Television> tvs = Catalog.findByBrand("Sony");
    assertNotNull(tvs);
    assertFalse(tvs.isEmpty());
    assertEquals(7, tvs.size()); //grey box, count, only this assert needed
  }

  @Test
  public void testFindByBrandsNoBrands() {
    Map<String,Collection<Television>> tvMap = Catalog.findByBrands();
    assertNotNull(tvMap);
    assertTrue(tvMap.isEmpty());
  }

  @Test
  public void testFindByBrands() {
    //var args allows separated by ,'s or as an array
    Map<String,Collection<Television>> tvs = Catalog.findByBrands("RCA", "Hitachi", "Sony", "Zenith", "NO_MATCHES");
    assertNotNull(tvs);
    assertFalse(tvs.isEmpty());
    assertEquals(9, tvs.get("RCA").size());
    assertEquals(0, tvs.get("NO_MATCHES").size());
    assertEquals(5, tvs.get("Hitachi").size());
    assertEquals(7, tvs.get("Sony").size());
    assertEquals(9, tvs.get("Zenith").size());

  }
}

