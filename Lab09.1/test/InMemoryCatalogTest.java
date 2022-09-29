import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.javatunes.catalog.InMemoryCatalog;
import com.javatunes.catalog.MusicItem;
import org.junit.Test;

public class InMemoryCatalogTest {

  @Test
  public void findById_exists(){
    MusicItem found = new InMemoryCatalog().findById(14L);
    assertEquals("So", found.getTitle());
    assertEquals("Peter Gabriel", found.getArtist());
  }

  @Test
  public void findById_nonExistent(){
    MusicItem found = new InMemoryCatalog().findById(Long.MAX_VALUE);
    assertNull(found);
  }
}
