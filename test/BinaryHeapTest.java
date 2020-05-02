import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryHeapTest {

    private BinaryHeap heap;

    @BeforeEach
    void setUp() {
        heap = new BinaryHeap(4);
        heap.insert(5);
        heap.insert(2);
        heap.insert(9);
        heap.insert(7);
    }

    @Test
    void shouldHaveMaxAtTop() {
        assertEquals(9, heap.max());
    }

    @Test
    void shouldActAsAHeap() {
        assertEquals(9, heap.deleteMax());
        assertEquals(7, heap.deleteMax());
        assertEquals(5, heap.deleteMax());
        assertEquals(2, heap.deleteMax());
    }
}