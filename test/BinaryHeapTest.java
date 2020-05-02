import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryHeapTest {

    @Test
    void shouldActAsAHeap() {
        BinaryHeap heap = new BinaryHeap();
        heap.insert(5);
        heap.insert(2);
        heap.insert(9);
        heap.insert(7);

        assertEquals(9, heap.deleteMax());
        assertEquals(7, heap.deleteMax());
        assertEquals(5, heap.deleteMax());
        assertEquals(2, heap.deleteMax());
    }
}