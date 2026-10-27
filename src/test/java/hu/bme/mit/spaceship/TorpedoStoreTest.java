
package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        TorpedoStore store = new TorpedoStore(1);

        boolean result = store.fire(1);

        assertEquals(true, result);
    }

    @Test
    void fire_EmptyStore_ThrowsException() {
        TorpedoStore store = new TorpedoStore(0);

        assertThrows(IllegalArgumentException.class, () -> store.fire(1));
    }

    @Test
    void fire_StoreRunsOutOfTorpedoes_ThrowsException() {
        TorpedoStore store = new TorpedoStore(1);

        store.fire(1);

        assertThrows(IllegalArgumentException.class, () -> store.fire(1));
    }
}
